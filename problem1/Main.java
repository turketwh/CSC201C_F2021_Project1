import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> cart = new ArrayList<Item>();
        Item itemOne = new Item("6-Pack Brawny Paper Towels", "G02439", 12.00);
        cart.add(itemOne);
        Item itemTwo = new Item("Star Wars Movie", "G21763", 8.00);
        cart.add(itemTwo);

        // TODO: After implementing the DigitalItem class, uncomment the section below
        // Cost of the items in the cart should go to 25.0,
        // but the tax on items in cart should stay at 2.0
        /*
        DigitalItem itemThree = new DigitalItem("Marvelous Mrs. Maisel", "E162021", 5.00);
        cart.add(itemThree);
         */

        double totalPrice = 0.00;
        double totalTax = 0.00;
        System.out.println("Items in cart:");
        for (int i = 0; i < cart.size(); i++) {
            Item anItem = cart.get(i);
            System.out.println("\t" + anItem.getName());
            totalPrice = totalPrice + anItem.getPrice();
            totalTax = totalTax + anItem.getTax(0.10);
        }
        System.out.println("Cost of items in cart: " + totalPrice);
        System.out.println("Tax on items in cart: " + totalTax);
    }
}
