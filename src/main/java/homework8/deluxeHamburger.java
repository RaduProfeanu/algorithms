package homework8;

public class deluxeHamburger extends Hamburger {

    public deluxeHamburger(String bread, int meat) {

        super("Rye", meat);
    }

    @Override
    public double makeOrder(boolean chips, boolean drink, boolean noOtherFeature1, boolean noOtherFeature2, boolean noOtherFeature3, boolean noOtherFeature4) {
        //I used noOtherFeature to mark that there is no added variants-- only chips and drink
        price = 0.00;
        if (getMeat() == 1) {
            price += 32.50;
            System.out.println("Healthy " + getBread() + " burger: 22.50");
        }

        if (getMeat() > 1) {
            price += 38.50;
            System.out.println("Healthy with extra meat " + getBread() + " burger: 28.50");
        }

        return price;
    }
}