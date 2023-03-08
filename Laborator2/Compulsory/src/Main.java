public class Main {
    public static void main(String[] args) {

        RoadType type;
        Road[] drumuri = new Road[2];
        drumuri[0] = new Road("GheorgheDoja",RoadType.EXPRESS);
        drumuri[1] = new Road("Traian",RoadType.HIGHWAY);
        Location LC = new Location();
        LC.setLocation("Viena",2,drumuri);
        System.out.println(LC.toString());

    }
}