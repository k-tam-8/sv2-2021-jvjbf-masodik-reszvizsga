package city;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private long fullArea;
    private List<Building> buildings = new ArrayList<>();

    public City(String name, long fullArea) {
        this.name = name;
        this.fullArea = fullArea;
    }

    public void addBuilding(Building b) {
        long l = 0;
        for (Building building : buildings) {
            l += b.getArea();
        }
        if (b.getArea() + l < fullArea) {
            buildings.add(b);
        }
    }

    public String getName() {
        return name;
    }

    public long getFullArea() {
        return fullArea;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public Building findHighestBuilding() {
        int floors = Integer.MIN_VALUE;
        Building tallestBuilding = null;
        for (Building b : buildings) {
            if (b.getLevels() > floors) {
                tallestBuilding = b;
            }
        }
        return tallestBuilding;
    }

    public List<Building> findBuildingsByStreet(String street) {
        List<Building> buildingOfStreet = new ArrayList<>();
        for (Building b : buildings) {
            if (b.getAddress().getStreet().equals(street)) {
                buildingOfStreet.add(b);
            }
        }
        return buildingOfStreet;
    }


}
