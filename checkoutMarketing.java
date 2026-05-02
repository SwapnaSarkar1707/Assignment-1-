import java.util.*;

public class checkoutMarketing {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        
        System.out.println("---Welcome to BaseCase Shop---");
        System.out.print("How many item do you want to purchase?(max 5): ");
        
        int n = sw.nextInt();
        if (n > 5) {
            System.out.println("Limit exceeded!!!");
            n = 5;
        }

        String[] productNames = new String[n];
        double[] prices = new double[n];
        int[] quantities = new int[n];
        double subtotal = 0;

        for (int i = 0; i < n; i++) {
            sw.nextLine(); 
            System.out.println("\nEnter Details for product " + (i + 1));
            
            System.out.print("Enter Product Name: ");
            productNames[i] = sw.nextLine();
            
            System.out.print("Enter Price: ");
            prices[i] = sw.nextDouble();
            
            System.out.print("Enter Quantity: ");
            quantities[i] = sw.nextInt();

            if (prices[i] <= 0 || quantities[i] <= 0) {
                System.out.println("Invalid!!! Please enter again");
                i--;
                continue;
            }
            subtotal = subtotal + (prices[i] * quantities[i]);
        }

        double discount;
        if (subtotal > 100) {
            discount = subtotal * 0.20;
        } else if (subtotal > 50) {
            discount = subtotal * 0.10;
        } else {
            discount = subtotal * 0.05;
        }

        double deliveryFee = (subtotal < 50) ? 10 : 0;
        double finalTotal = subtotal - discount + deliveryFee;

        System.out.println("\n*****");
        System.out.println("---Final Receipt---");
        for (int i = 0; i < n; i++) {
            double itemTotal = prices[i] * quantities[i];
            System.out.println("Item " + (i + 1) + ": " + productNames[i] + " - " + quantities[i] + " x " + prices[i] + " = " + itemTotal);
        }

        System.out.println("-------------------------");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Delivery Fee: " + deliveryFee);
        System.out.println("Final Total: " + finalTotal);
        System.out.println("---------------------");
        
        sw.close();
    }
}