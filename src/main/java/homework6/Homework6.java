package homework6;

public class Homework6 {

    public static void main(String[] args) {


        // this is exercise one
        homework6.Wall wall = new homework6.Wall(3, 4);

        System.out.println("area " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height=" + wall.getHeight());
        System.out.println("area " + wall.getArea());

        // this is exercise two

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        Point point = new Point(3, 1);
        System.out.println("distance()= " + point.distance());
    }
}


