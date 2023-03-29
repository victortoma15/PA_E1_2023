import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Node> nodes = new ArrayList<Node>();
        nodes.add(new Person("Victor"));
        nodes.add(new Person("Vlad"));
        nodes.add(new Person("Stefan"));
        nodes.add(new Company("Endava"));
        nodes.add(new Company("camLine"));
        nodes.add(new Company("heavenSolutions"));
        nodes.add(new Company("bitdefender"));
        nodes.add(new Company("Bytex"));

        nodes.sort(Comparator.comparing(Node::getName));

        for (Node node : nodes) {
            System.out.println(node.getName());

        }
    }
}