package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exploration {
    private final SharedMemory mem = new SharedMemory(3);
    private final ExplorationMap map = new ExplorationMap(3);
    private final List<Robot> robots = new ArrayList<>();
    private Timer timer;

    public void start() {
        for (Robot robot : robots) {
            new Thread(robot).start();
        }
        Thread thread = new Thread(() -> {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                try {
                    char command = (char) reader.read();
                    if (command == 'p') {
                        for (Robot robot : robots) {
                            robot.pause();
                        }
                    } else if (command == 'r') {
                        for (Robot robot : robots) {
                            robot.resume();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        new Thread(timer).start();
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public ExplorationMap getMap() {
        return map;
    }

    public SharedMemory getMem() {
        return mem;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }
}
