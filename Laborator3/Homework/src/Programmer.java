import java.time.LocalDate;

public class Programmer extends Person {
    private String language;
    public Programmer(String name, LocalDate birthDate, String language) {
        super(name, birthDate);
        this.language = language;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    @Override
    public String toString() {
        return super.toString() + " - Programmer (" + language + ")";
    }
}