package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GameClient {
    private String host;
    private int port;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public GameClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start() {
        try {
            socket = new Socket(host, port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            System.out.println("Connected to server at " + host + ":" + port);
            System.out.println("Type 'exit' to quit");

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String input = keyboard.readLine();
                if (input == null || input.equalsIgnoreCase("exit")) {
                    break;
                }
                out.println(input);
                String response = in.readLine();
                System.out.println(response);
            }
            socket.close();
        } catch (IOException e) {
            System.err.println("Error connecting to server: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        GameClient gameClient = new GameClient("localhost", 8000);
        gameClient.start();
    }
}
