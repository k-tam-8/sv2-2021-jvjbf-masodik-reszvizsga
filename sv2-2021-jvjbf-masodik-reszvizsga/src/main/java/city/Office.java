package city;

public class Office extends Building {
    private String company;
    private int numberOfTablesPerLevel;

    public Office(double area, int floor, Address address, String company, int numberOfTablesPerLevel) {
        super(area, floor, address);
        this.company = company;
        this.numberOfTablesPerLevel = numberOfTablesPerLevel;
        if ((numberOfTablesPerLevel * 2) > area || (numberOfTablesPerLevel * 5) < area) {
        } else throw new IllegalArgumentException("Nem megfelelő szám!");
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return 0;
    }

    public String getCompany() {
        return company;
    }

    public int getNumberOfTablesPerLevel() {
        return numberOfTablesPerLevel;
    }
}
