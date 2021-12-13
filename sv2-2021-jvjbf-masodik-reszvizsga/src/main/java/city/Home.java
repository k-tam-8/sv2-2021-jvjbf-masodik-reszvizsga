package city;

public class Home extends Building {

    public static final int SQUARE_METERS_NEED_PER_PERSON = 20;

    public Home(double area, int floor, Address address) {
        super(area, floor, address);
        if (floor > 3) {
            throw new IllegalArgumentException("A szintek száma maximum 3!");
        }
    }

    public Home(double area, Address address) {
        super(area, address);
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return (int) (super.getArea() * super.getLevels() / SQUARE_METERS_NEED_PER_PERSON);
    }
}
