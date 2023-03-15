import java.util.Objects;

/**
 * Operatiile necesare pentru manipularea drumurilor
 */
public class Road {
    private String name;
    private Location loc1, loc2;

    /**
     * Constructorul folosit; Un drum leaga 2 locatii: loc1, loc2
     * @param name - numele drumului
     * @param loc1 - una dintre locatiile legate de drumul respectiv
     * @param loc2 - cealalta locatie care apartine de drumul respectiv
     */
    public Road(String name, Location loc1, Location loc2)
    {
        this.name = name;
        this.loc1 = loc1;
        this.loc2 = loc2;
    }

    /**
     * Getter pentru numele drumului
     * @return - returneaza numele
     */
    public String getName() {
        return name;
    }

    /**
     * Setter pentru numele drumului
     * @param name - numele drumului
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter pentru locatia 1 (una din cele 2 locatii ce stau de o parte si de cealalta a drumului)
     * @return - returneaza locatia 1
     */
    public Location getLoc1() {
        return loc1;
    }

    /**
     * Getter pentru locatia 2 (una din cele 2 locatii ce stau de o parte si de cealalta a drumului)
     * @return - returneaza locatia 2
     */
    public Location getLoc2() {
        return loc2;
    }

    /**
     * Override-ul pentru compararea a doua obiecte de tip Road
     * @param o - obiectul supus compararii
     * @return - returneaza 1 daca operatia de comparare este realizata cu succes, 0 in caz contrar
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Road)) return false;
        Road road = (Road) o;
        return Objects.equals(name, road.name);
    }

    /**
     * Operatie necesara pentru a afisa la ecran in formatul unor string-uri
     * @return - returneaza output-ul sub forma unor string-uri
     */
    @Override
    public String toString() {
        return "Road : " +
                "name = '" + name + '\'';
    }


}