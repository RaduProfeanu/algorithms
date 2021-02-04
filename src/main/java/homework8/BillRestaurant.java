package homework8;

public class BillRestaurant {
    public static void main(String[] args) {
        classicBurger myOrder = new classicBurger("Rye", 1); //although this code isn't the best, 0-3 patties work seamlessly

        myOrder.makeOrder(true, true, true, true,
                false, true);

        System.out.println("\n");

        healthyHamburger myOrder2=new healthyHamburger("",1);
        myOrder2.makeOrder(true,true,true,true,true, true);

        System.out.println("\n");

        deluxeHamburger finalOrder = new deluxeHamburger("",2);

        finalOrder.makeOrder(true, true, true, true, true, true);
    }
}
