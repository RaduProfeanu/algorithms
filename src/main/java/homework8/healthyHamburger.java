package homework8;

public class healthyHamburger extends Hamburger {
    public healthyHamburger(String bread, int meat) {
        super("Wheat", meat);
    }

    @Override
    public double makeOrder(boolean lettuce, boolean tomato, boolean onion, boolean cheese, boolean kale, boolean mushroom) {
        price = 0.00;

        if (getMeat() == 1) {
            price += 22.50;
            System.out.println("Healthy " + getBread() + " burger: 22.50");
        }

        if (getMeat() > 1) {
            price += 28.50;
            System.out.println("Healthy with extra meat " + getBread() + " burger: 28.50");
        }

        if (tomato) {
            price += 2.35;
            System.out.println("Tomato: 2.35");
        } else {
            System.out.println();
        }

        if (onion) {
            price += 2.20;
            System.out.println("Onion: 2.20");
        } else {
            System.out.println();
        }

        if (cheese) {
            price += 3.75;
            System.out.println("Cheese: 3.75");
        } else {
            System.out.println();
        }

        if (kale) {
            price += 4.90;
            System.out.println("Kale: 4.90");
        } else {
            System.out.println();
        }

        if (mushroom) {
            price += 2.65;
            System.out.println("Mushroom: 2.65");
        } else {
            System.out.println();
        }

        System.out.println("Total: " + price);
        return price;
    }

}
