package homework8;

public class gamingChair {

    public String color;
    public int height;
    public boolean retractable;

    public gamingChair(String color, int height, boolean retractable) {
        this.color = color;
        this.height = height;
        this.retractable = retractable;
    }

    public String getColor() {
        return color;
    }

    public void retractChair(){
        System.out.println("Chair is retractable!");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isRetractable() {
        return retractable;
    }

    public void setRetractable(boolean retractable) {
        this.retractable = retractable;
    }
}
