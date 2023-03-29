package org.example;
import java.util.*;
public class Student implements Comparable<Student>{


    public String name;
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int compareTo(Student student) {
        return 0;
    }
    @Override
    public String toString() {
        return "Student{" +
                " name = '" + name + '\'' +
                " }";
    }
}
