package org.example;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){

        List<Student> studentList = new LinkedList<>();
        TreeSet<Project> projectTree = new TreeSet<>();
        var student = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Student("S" + i))
                .toArray(Student[]::new);
        var projects = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Project("P" + i))
                .toArray(Project[]::new);

        for(Student s : student) {
            studentList.add(s);
        }

        Collections.sort(studentList);

        for(int i = 0; i < 4; i++){
            System.out.println(student[i]);
        }
        System.out.println("");


        for(Project p : projects){
            projectTree.add(p);
        }

        for(int i = 0; i < 4; i++){
            System.out.println(projects[i]);
        }

    }
}
