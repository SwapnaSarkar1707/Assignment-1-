public class Order {
    private String productName;
    private double unitPrice;
    private int quantity;

    public Order(String name, double price, int qty) throws Exception {
        this.productName = name;
        setUnitPrice(price);
        setQuantity(qty);
    }

    public void setUnitPrice(double price) throws Exception {
        if (price <= 0) {
            throw new Exception("Error: Unit price must be greater than zero.");
        }
        this.unitPrice = price;
    }

    public void setQuantity(int qty) throws Exception {
        if (qty <= 0) {
            throw new Exception("Error: Quantity must be greater than zero.");
        }
        this.quantity = qty;
    }

    public double getTotal() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return productName + " - " + quantity + " pcs x " + unitPrice + " = " + getTotal();
    }

    public static void main(String[] args) {
        try {
            System.out.println("--- Order Test ---");
            Order o1 = new Order("Gaming Mouse", 25.75, 3);
            Order o2 = new Order("Mechanical Keyboard", 120.0, 1);
            
            System.out.println(o1);
            System.out.println(o2);

            System.out.println("--- Invalid Order Attempt ---");
            Order o3 = new Order("Laptop", -500, 1); 

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}