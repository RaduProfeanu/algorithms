package homework7;

public class Main {
    public static void main(String[] args) {

        Car masina = new Car();

        SuzukiCar suzu =new SuzukiCar();

        masina.changingGears();
        System.out.println(suzu.getNoOfWheels(5));
        System.out.println(suzu.getYearOfManufacture(2015));

    }
}
