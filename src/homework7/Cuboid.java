package homework7;

public class Cuboid extends Rectangle {

    public double height;
    private double length;
    private double width;

    public Cuboid(double length, double width,double height) {
        super(length, width);
        if (height < 0) {
            height = 0;
        }
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getVolume(){
        return this.height*getArea();
    }
}
