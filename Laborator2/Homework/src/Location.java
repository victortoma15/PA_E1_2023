import java.util.Arrays;
import java.util.Objects;

/**
 * Operatiile necesare pentru manipularea locatiilor
 */
public class Location {
    private String name;
    private int isVisited;

    /**
     * Getter pentru operatia de vizitare a oraselor
     * @return - returneaza 1 daca o locatie a fost vizitata / 0 in caz contrar
     */
    public int isVisited() {
        return isVisited;
    }

    /**
     * Setter pentru operatia de vizitare a oraselor
     * @param visited - daca s-a vizitat / nu s-a vizitat un oras
     */
    public void setVisited(int visited) {
        isVisited = visited;
    }

    /**
     * Constructorul folosit
     * @param name - numele locatiei
     */
    public Location(String name)
    {
        this.name = name;
        this.isVisited = 0;
    }

    /**
     * Getter pentru denumirea locatiilor / oraselor
     * @return - operatie prin care se obtine numele orasului
     */
    public String getName() {
        return name;
    }

    /**
     * Setter pentru denumirea locatiilor / oraselor
     * @param name - numele orasului
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Override-ul pentru compararea a doua obiecte de tip Location
     * @param o - obiectul supus compararii
     * @return - returneaza 1 daca operatia de comparare este realizata cu succes, 0 in caz contrar
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return Objects.equals(name, location.name);
    }

    /**
     * Operatie necesara pentru a afisa la ecran in formatul unor string-uri
     * @return - returneaza output-ul sub forma unor string-uri
     */
    @Override
    public String toString() {
        return "Location " +
                "Name : '" + name + '\'' +
                '}';
    }
}