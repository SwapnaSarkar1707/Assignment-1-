package project4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in); 
        ArrayList<Order> list = new ArrayList<>();
        
        System.out.println("--- Welcome to BaseCase Shop ---");
        System.out.print("How many items do you want to order? ");
        int count = sw.nextInt(); 
        if (count > 5) {
            count = 5;
            System.out.println("Limit exceeded! Setting count to 5.");
        }

        for (int i = 0; i < count; i++) {
            try {
                System.out.println("\nEnter details for Product " + (i + 1) + ":");
                System.out.print("Name: ");
                sw.nextLine();
                String name = sw.nextLine(); 
                System.out.print("Price: ");
                double price = sw.nextDouble();
                System.out.print("Quantity: ");
                int quantity = sw.nextInt();
                
                list.add(new Order(name, price, quantity));
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + " Skipping the item.");
            }
        }
        
        double subtotal = 0;
        for (Order o : list) {
            subtotal = subtotal + o.calculateTotal();
        }
        double discountRate = (subtotal > 100) ? 0.20 : (subtotal > 50 ? 0.10 : 0.05);
        double discountAmount = subtotal * discountRate;
        double deliveryFee = (subtotal < 50 && subtotal > 0) ? 10.0 : 0.0;
        double finalTotal = subtotal - discountAmount + deliveryFee;
        
        System.out.println("\n--- Final Receipt ---");
        for (Order o : list) {
            System.out.println(o.toString());
        }
        System.out.println("--------------------------------");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount (" + (int)(discountRate * 100) + "%): " + discountAmount);
        System.out.println("Delivery Fee: " + deliveryFee);
        System.out.println("Final Bill: " + finalTotal);
    }
}