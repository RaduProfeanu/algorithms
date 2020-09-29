package homework7;

import org.w3c.dom.ls.LSOutput;

public class Car extends Vehicle {

    private int noOfDoors;
    private String colour;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Car() {
    }
}
