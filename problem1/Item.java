public class Item {

    protected String name;
    protected String id;
    protected double price;

    public Item(String nameArg, String idArg, double priceArg) {
        name = nameArg;
        id = idArg;
        price = priceArg;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getTax(double taxRateArg) {
        return taxRateArg * price;
    }
}
