public class Company implements Comparable<Company>, Node {
    private String name;
    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Company company) {
        return 0;
    }

}
