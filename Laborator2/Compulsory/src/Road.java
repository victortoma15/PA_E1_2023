public class Road {
    private String name;
    private RoadType type;

    public Road(String name,RoadType type)
    {
        this.name=name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoadType getType() {
        return type;
    }

    public void setType(RoadType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Road : " +
                "name = '" + name + '\'' +
                ", type = " + type +
                '}';
    }
}