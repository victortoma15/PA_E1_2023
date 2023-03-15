import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Aici vor fi metodele care ajuta la rezolvarea problemei
 */
public class Problem {
    private List<Location> locationList;
    private List<Road> roadList;

    /**
     * Constructorul folosit; Locatiile si drumurile vor fi implementate drept liste
     */
    public Problem() {
        this.locationList = new ArrayList<Location>();
        this.roadList = new ArrayList<Road>();
    }

    /**
     * Functie utilizata pentru a adauga o locatie in lista de locatii
     * @param location - locatia care urmeaza a fi adaugata in lista
     */
    public void addLocation(Location location){
        locationList.add(location);
    }

    /**
     * Functie utilizata pentru a adauga un drum in lista de drumuri
     * @param road - drumul care urmeaza a fi adaugat in lista
     */
    public void addRoad(Road road){
        roadList.add(road);
    }

    /**
     * Getter pentru lista de locatii
     * @return - returneaza lista locatiilor
     */
    public List<Location> getLocationList() {
        return locationList;
    }

    /**
     * Getter pentru lista de drumuri
     * @return - returneaza lista drumurilor
     */
    public List<Road> getRoadList() {
        return roadList;
    }

    /**
     * Functie utilizata pentru a verifica daca instanta problemei este valida; Daca se verifica la un drum 2 locatii cu aceeasi denumire, practic aceeasi locatie sau
     * daca nu exista locatiile respective in lista, se va afisa false
     * @return - se va returna 1 daca instanta este valida / 0 in caz contrar
     */
    public Boolean isValid(){
        for(Road road : roadList) {
            if (!(locationList.contains(road.getLoc1())) || !(locationList.contains(road.getLoc2()))) {
                return false;
            }
            if(road.getLoc1().equals(road.getLoc2())){
                return false;
            }
        }
        return true;
    }

    /**
     * Functie utilizata pentru a calcula distanta dintre 2 locatii;
     * Vom folosi o coada pentru a memora locatiile vizitate, utilizand ideea parcurgerii BFS;
     * Utilizam setVisited pentru a "marca" / "memora" locatiile deja vizitate, in ideea parcurgerii tuturor locatiilor;
     * currentLocation reprezinta locatia curenta in curs de vizitare;
     * Ulterior, se vor realiza operatiile necesare pentru aflarea distantei dintre cele 2 locatii;
     * @param loc1 - una dintre locatiile pentru care se vrea calculata distanta
     * @param loc2 - cealalta locatie pentru care se vrea calculata distanta
     * @return - returneaza distanta dintre cele 2 locatii / daca cea de-a doua locatie este deja vizitata, se va afisa -1
     */
    public Integer distance(Location loc1, Location loc2){
        for(Location location : locationList){
            location.setVisited(0);
        }
        Queue <Location> q = new LinkedList<Location>();
        q.add(loc1);
        loc1.setVisited(1);
        while(!q.isEmpty()){
            Location currentLocation;
            currentLocation = q.peek();
            q.remove();
            for(Road road : roadList){
                if(road.getLoc1().equals(currentLocation)){
                    if(road.getLoc2().isVisited() == 0){
                        road.getLoc2().setVisited(road.getLoc1().isVisited() + 1);
                        q.add(road.getLoc2());
                    }
                }
                if(road.getLoc2().equals(currentLocation)){
                    if(road.getLoc1().isVisited() == 0){
                        road.getLoc1().setVisited(road.getLoc2().isVisited() + 1);
                        q.add(road.getLoc1());
                    }
                }
            }
        }

        if(loc2.isVisited() == 0){
            return -1;
        }
        else{
            return loc2.isVisited() - 1;
        }

    }
}
