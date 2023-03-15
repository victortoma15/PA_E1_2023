/**
 * Clasa care este mostenita (extends) din clasa Location, si reprezinta un tip de Locatie
 */
public class City extends Location{
    public City(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "City " +
                "Name : '" + super.getName() + '\'';
    }
}
