import java.util.Arrays;

public class Location {
    private String name;
    private Road[] road = new Road[2];
    private int nrDrumuri;

    public Location()
    {
        this.name = "";
        this.nrDrumuri = 0;
    }

    public void setLocation(String name, int nrDrumuri, Road[] road)
    {
        int i;
        this.name = name;
        this.nrDrumuri = nrDrumuri;
        for(i = 0; i < nrDrumuri; i++)
        {
            this.road[i] = road[i];
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Road[] getRoad() {
        return road;
    }

    public void setDrumuri(Road[] roads) {
        this.road = roads;
    }

    public int getNrDrumuri() {
        return nrDrumuri;
    }

    public void setNrDrumuri(int nrDrumuri) {
        nrDrumuri = nrDrumuri;
    }

    @Override
    public String toString() {
        return "Location " +
                "Name : '" + name + '\'' +
                ", roads : " + Arrays.toString(road) +
                ", NrDrumuri =" + nrDrumuri +
                '}';
    }
}