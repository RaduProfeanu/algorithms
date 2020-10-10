package homework8;

public class classicBurger extends Hamburger {

    public classicBurger(String bread, int meat) {
        super(bread, meat);
    }

    @Override
    public double makeOrder(boolean lettuce, boolean tomato, boolean onion, boolean cheese, boolean opt5, boolean opt6) {

        price=0.00;

        if (getMeat() == 1) {
            price += 22.50;
            System.out.println("Classic " + getBread() + " burger: 22.50");
        }

        if (getMeat()>1){
            price += 28.50;
            System.out.println("Classic with extra meat " + getBread() + " burger: 28.50");
        }
        if (lettuce) {
            price += 2.25;
            System.out.println("Lettuce: 2.25");
        } else {
            System.out.println("");
        }

        if (tomato) {
            price += 2.35;
            System.out.println("Tomato: 2.35");
        } else {
            System.out.println("");
        }

        if (onion) {
            price += 2.20;
            System.out.println("Onion: 2.20");
        } else {
            System.out.println("");
        }

        if (cheese) {
            price += 3.75;
            System.out.println("Cheese: 3.75");
        } else {
            System.out.println("");
        }


        System.out.println("Total: " + price);
        return price;


    }
}
