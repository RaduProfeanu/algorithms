package homework6;

public class Wall {

    private double Width;
    private double Height;

    public Wall(double width, double height){

        if (width<0){
            Width=0;
        }else{
            Width=width;
        }

        if (width<0){
            Height=0;
        }else{
            Height=height;
        }

    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {

        if (width<0){
            width=0;
        }
        this.Width = width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        if (height<0){
            height=0;
        }
        this.Height = height;
    }

    public double getArea(){
        double area=0.0;
        area =Width*Height;

        return area;
    }
}
