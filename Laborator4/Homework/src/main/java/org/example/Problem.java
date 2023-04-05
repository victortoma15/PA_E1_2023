package org.example;

import java.util.*;
import org.apache.commons.lang3.tuple.Pair;

public class Problem {
    private final List<Student> students;
    private final Set<Project> projects;

    public Problem(List<Student> students, Set<Project> projects) {
        this.students = students;
        this.projects = projects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public List<Student> studentsWithFewPreferences() {
        OptionalDouble average = Utilities.averagePreferencesOfStudents(students.toArray(new Student[0]));
        int averagePreferences = (int) Math.round(average.orElse(0.0));
        return students.stream().filter(student -> student.getAdmissableProjects().size() < averagePreferences).toList();
    }

    public Set<Pair<Student, Project>> generateMatching() {
        Set<Pair<Student, Project>> matching = new HashSet<>();
        List<Student> unmatchedStudents = new ArrayList<>(students);
        projects.forEach(project -> {
            List<Student> preferences = new ArrayList<>();
            unmatchedStudents.forEach(student -> {
                if (student.getAdmissableProjects().contains(project)) {
                    preferences.add(student);
                }
            });
            while (!preferences.isEmpty() && matching.contains(project)) {
                preferences.sort(Comparator.comparingInt(student -> {
                    int index = project.getPreferences().indexOf(String.valueOf(student));
                    return index == -1 ? Integer.MAX_VALUE : index;
                }));
                Student selected = preferences.remove(0);
                matching.removeIf(pair -> pair.getKey().equals(selected));
                matching.add(new Pair<>() {
                    @Override
                    public Project setValue(Project value) {
                        return null;
                    }

                    @Override
                    public Student getLeft() {
                        return students.iterator().next();
                    }

                    @Override
                    public Project getRight() {
                        return projects.iterator().next();
                    }

                });
                unmatchedStudents.remove(selected);
            }
        });
        return matching;
    }

    public Student[] getStudentList(Object students) {
        return (Student[]) students;
    }
}
