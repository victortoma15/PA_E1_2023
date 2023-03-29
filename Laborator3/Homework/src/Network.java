import java.util.*;
public class Network {

    public List<Object> getNetwork() {
        return network;
    }
    private static ArrayList<Object> nodes;
    private List<Object> network;

    public Network() {
        this.nodes = new ArrayList<>();
    }

    public static List<List<Object>> getNodes() {
        return (List) nodes;
    }

    public void addNode(Object node) {
        nodes.add(node);
    }


    public int computeImportance(Object node) {
        int importance = 0;
        if (node instanceof Person) {
            Person person = (Person) node;
            importance = person.getRelationships().size();
        }
        else if (node instanceof Company) {
            Company company = (Company) node;
            importance = company.getEmployees().size();
        }
        return importance;
    }

    public void printNetwork() {
        nodes.sort(Comparator.comparingInt(this::computeImportance).reversed());
        for (Object node : nodes) {
            if (node instanceof Person) {
                Person person = (Person) node;
                System.out.println(person.getName() + " (" + computeImportance(person) + " connections)");
                Map<Person, String> relationships = person.getRelationships();
                if (!relationships.isEmpty()) {
                    System.out.println("Relationships:");
                    for (Map.Entry<Person, String> entry : relationships.entrySet()) {
                        System.out.println("    - " + entry.getKey().getName() + " (" + entry.getValue() + ")");
                    }
                }
                Company company = person.getEmployer();
                if (company != null) {
                    System.out.println("Company and position:");
                    System.out.println("    - " + company.getName() + " (" + company.getEmployees().get(person) + ")");
                }
            } else if (node instanceof Company) { // node instanceof Company
                Company company = (Company) node;
                System.out.println(company.getName() + " (" + computeImportance(company) + " employees)");
                Map<Person, String> employees = company.getEmployees();
                if (!employees.isEmpty()) {
                    System.out.println(" Employees:");
                    for (Map.Entry<Person, String> entry : employees.entrySet()) {
                        System.out.println("    - " + entry.getKey().getName() + " (" + entry.getValue() + ")");
                    }
                }
            }
            System.out.println("");
        }
    }
}