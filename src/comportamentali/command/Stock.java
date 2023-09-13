package comportamentali.command;

public class Stock {

    private String name;
    private int quantity;

    public Stock() {
        this.name = "Stock standard";
        this.quantity = 100;
    }

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", " +
                "Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", " +
                "Quantity: " + quantity + " ] sold");
    }
}
