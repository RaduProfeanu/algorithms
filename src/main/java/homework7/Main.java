package homework7;

public class Main {
    public static void main(String[] args) {

        Car masina = new Car();

        SuzukiCar suzu =new SuzukiCar();

        masina.changingGears();
        System.out.println(suzu.getNoOfWheels(5));
        System.out.println(suzu.getYearOfManufacture(2015));


        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());


    }
}
