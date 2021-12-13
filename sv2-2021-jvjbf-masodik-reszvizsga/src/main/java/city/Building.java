package city;

public abstract class Building {
    private double area;
    private int levels;
    private Address address;

    public Building(double area, int floor, Address address) {
        this.area = area;
        this.levels = floor;
        this.address = address;
    }

    public Building(double area, Address address) {
        this.area = area;
        this.address = address;
        this.levels = 1;
    }

    public double getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    public Address getAddress() {
        return address;
    }

    public double getFullArea() {
        return (double) area * levels;
    }

    public abstract int calculateNumberOfPeopleCanFit();
}
