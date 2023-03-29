import java.time.LocalDate;
import java.util.*;
import java.util.HashMap;

public class Person implements Comparable{
    private String name;
    private LocalDate birthDate;
    private Map<Person, String> relationships;
    private static Map<Company, String> employment;
    private int specificProperty;
    private Company employer;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.relationships = new HashMap<>();
        this.employment = new HashMap<>();
        this.specificProperty = 0;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Map<Person, String> getRelationships() {
        return relationships;
    }

    public Map<Company, String> getEmployment() {
        return employment;
    }

    public int getSpecificProperty() {
        return specificProperty;
    }

    public void setSpecificProperty(int specificProperty) {
        this.specificProperty = specificProperty;
    }

    public void setEmployer(Company employer, String position) {
        this.employer = employer;
    }

    public void addRelationship(Person person, String relationship) {
        relationships.put(person, relationship);
    }
    public Company getEmployer(Company company, String position) {
        employment.put(company, position);
        return company;
    }
    @Override
    public String toString() {
        return name + " (born " + birthDate + ")";
    }

    public Company getEmployer() {
        return employer;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
