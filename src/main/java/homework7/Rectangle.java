package homework7;

public class Rectangle {

    private double length;
    private double width;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if(length<0){
            length=0;
        }

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            width=0;
        }

        this.width = width;
    }

    public Rectangle(double length, double width){

        if (width<0){
            this.width=0;
        }else{
           this.width=width;
        }

        if (width<0){
            this.length=0;
        }else{
            this.length=length;
        }
    }

    public double getArea(){
        return length*width;
    }


}
