package org.example;

public class Project implements Comparable<Project>{


    public String name;
    public Project(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int compareTo(Project project) {
        return 0;
    }
    @Override
    public String toString() {
        return "Project{" +
                " name = '" + name + '\'' +
                " }";
    }
}
