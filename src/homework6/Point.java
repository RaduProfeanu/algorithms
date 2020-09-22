package homework6;

public class Point {

    private int x;
    private int y;

    public Point(int i, int i1){
        System.out.println("This is a default constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(x*x+y*y);
    }

    public double distance(Point original){
        double x1;
        double y1;

        x1=x-original.getX();
        y1=y-original.getY();

        return Math.sqrt(x1*x1+y1*y1);

    }

}
