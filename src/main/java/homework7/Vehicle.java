package homework7;

public class Vehicle {


    private int noOfWheels;
    private double millage;

    public void steers(){
        System.out.println("vehicle steers");
    }

    public void changingGears(){
        System.out.println("vehicle changes gear");

    }

    public void moving(double speed){
        System.out.println("Vehicle moves with speed "+speed);
    }

    public int getNoOfWheels(int noOfWheels) {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public double getMillage() {
        return millage;
    }

    public void setMillage(double millage) {
        this.millage = millage;
    }
}
