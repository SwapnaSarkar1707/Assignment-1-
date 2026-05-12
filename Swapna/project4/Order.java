package project4;

class Order{
    private String name;
    private double price;
    private int quantity;
    public Order(String name,double price,int quantity) throws Exception{
        if(price<=0||quantity<=0){
            throw new Exception("Price and Quantity is positive .");
        }
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public double calculateTotal(){
      return price*quantity;
    }
    @Override
     public String toString(){
     return "Item: "+name+"| Price: "+ price+"Quantity:"+quantity+"|Total:"+calculateTotal();
    }
}