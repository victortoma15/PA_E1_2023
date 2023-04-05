package org.example;

public class Project implements Comparable<Project> {
    private String name;
    String preferences;

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Project project) {
        return this.name.compareTo(project.name);
    }

    public String getPreferences() {

        return preferences;
    }
}
