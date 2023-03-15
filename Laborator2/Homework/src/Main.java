/**
 * Clasa in care se realizeaza comenzile dorite (adaugari, distante, verificarea unei instante);
 */
public class Main {
    public static void main(String[] args) {

        City city1 = new City("Telejna");
        City city2 = new City("Fastaci");
        City city3 = new City("Laza");
        City city4 = new City("Dristor");
        Problem pb1 = new Problem();
        pb1.addLocation(city1);
        pb1.addLocation(city2);
        pb1.addLocation(city3);
        pb1.addLocation(city4);
        Road road1 = new Highway("A1", city1, city2);
        Road road2 = new Express("E1", city2, city3);
        Road road3 = new Highway("A9", city1, city3);
        pb1.addRoad(road1);
        pb1.addRoad(road2);
        pb1.addRoad(road3);
        System.out.println(pb1.getLocationList());
        System.out.println(pb1.getRoadList());
        System.out.println("Instanta problemei este valida? " + pb1.isValid());
        System.out.println("Distanta dintre cele 2 orase selectate: " + pb1.distance(city1, city3));
        System.out.println("Distanta dintre cele 2 orase selectate: " + pb1.distance(city2, city4));

    }
}