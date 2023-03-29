public class Person implements Comparable<Person>, Node {

    private String Name;

    public Person(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    @Override
    public int compareTo(Person person) {
        return 0;
    }
}
