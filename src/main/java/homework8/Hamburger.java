package homework8;

public class Hamburger {

    private final String bread;
    private final int meat;
    public double price;


    public Hamburger(String bread, int meat) {
        this.bread = bread;

        if (meat>3){
            this.meat=3;
        }else{
            this.meat=meat;
        }

    }

    public String getBread() {
        return bread;
    }

    public int getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }
    public double makeOrder(boolean opt1, boolean opt2, boolean opt3,
                            boolean opt4, boolean opt5, boolean opt6) {

        return price;
    }

}





