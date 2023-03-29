import java.util.*;
import java.util.HashMap;
public class Company implements Comparable{
    private String name;
    private Map<Person, String> employees;
    private String specificProperty;

    public Company(String name,String specificProperty){
        this.name = name;
        this.employees = new HashMap<>();
        this.specificProperty = specificProperty;
    }

    public String getName() {
        return name;
    }

    public Map<Person, String> getEmployees() {
        return employees;
    }

    public String getSpecificProperty() {
        return specificProperty;
    }

    public void setSpecificProperty(String specificProperty) {
        this.specificProperty = specificProperty;
    }

    public void addEmployee(Person person, String position) {
        employees.put(person, position);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}