import java.util.*;
public class assignment1 {
  public static void main(String[]args){
    Scanner sw=new Scanner(System.in);
    System.out.println("---Welcome to the Swapna Shop--");
    System.out.print("Enter Product Name :");
    String ProductName=sw.nextLine();
    System.out.print("Unit Price:");
    double UnitPrice=sw.nextDouble();
    System.out.print("Quantity:");
    int Quantity=sw.nextInt();
   final double discountrate=0.15;
    System.out.println("---Final Receipt---");
    System.out.println("Item:"+ProductName);
    double subtotal=UnitPrice*Quantity;
    System.out.println("Subtotal:$"+subtotal);
    double discount_amount=subtotal*discountrate;
    System.out.println("Discount Applied:$"+discount_amount);
    double totalprice=subtotal-discount_amount;
    int final_price=(int)totalprice;
    System.out.println("Total(Rounded Down)$"+final_price);
    System.out.println("-------------------------------------");
  }  
}
