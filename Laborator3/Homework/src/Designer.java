import java.time.LocalDate;

public class Designer extends Person {
    private String tool;

    public Designer(String name, LocalDate birthDate, String tool) {
        super(name, birthDate);
        this.tool = tool;
    }


    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    @Override
    public String toString() {
        return super.toString() + " - Designer (" + tool + ")";
    }
}