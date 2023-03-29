import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Network network = new Network();
        int importance = network.computeImportance(Network.getNodes());

        Programmer Victor = new Programmer("Victor", LocalDate.of(2002, 8, 27),"Java");
        Programmer Vlad = new Programmer("Vlad", LocalDate.of(2000, 10, 15),"C#");
        Person Ruxandra = new Person("Ruxandra", LocalDate.of(1975, 3, 8));
        Person Letizia = new Person("Letizia", LocalDate.of(2003, 2, 20));
        Person Alexandra = new Person("Alexandra", LocalDate.of(2001, 6, 1));
        Designer Stefan = new Designer("Stefan", LocalDate.of(1999, 4, 16),"Adobe");

        Company Shoreline = new Company("Shoreline", "Software");
        Company HeavenSolutions = new Company("HeavenSolutions", "Testing");
        Company CamLine = new Company("CamLine", "Export");

        network.addNode(Alexandra);
        network.addNode(Vlad);
        network.addNode(Stefan);
        network.addNode(Ruxandra);
        network.addNode(Letizia);
        network.addNode(Shoreline);
        network.addNode(HeavenSolutions);
        network.addNode(CamLine);

        Alexandra.addRelationship(Vlad, "BestFriend");
        Alexandra.setEmployer(Shoreline, "QA");
        Vlad.addRelationship(Stefan, "Colleague");
        Vlad.setEmployer(HeavenSolutions, "Back-end Developer");
        Stefan.setEmployer(CamLine, "Designer");
        Stefan.addRelationship(Letizia, "Team-lead");
        Ruxandra.addRelationship(Victor, "Family");
        Letizia.addRelationship(Vlad, "Colleague");
        Letizia.setEmployer(Shoreline, "HR");

        Shoreline.addEmployee(Alexandra, "QA");
        HeavenSolutions.addEmployee(Vlad, "Back-end Developer");
        Shoreline.addEmployee(Letizia, "HR");
        CamLine.addEmployee(Stefan, "Designer");


        network.printNetwork();
    }
}