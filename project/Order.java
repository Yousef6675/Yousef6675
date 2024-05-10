public class Order {

 // Attributes
 private int customerId;
 private int orderId;
 private Product[] products;
 private float totalPrice;
 private int counter = 0;
 // This counter keeps track of OrderId

 // Constructors:
 public Order(int customerId, Product[] products, float totalPrice) {
  this.customerId = customerId;
  this.orderId = counter;
  this.products = products;
  this.totalPrice = totalPrice;
  counter++;
 }

 // Methods
 public void printOrderInfo() {
  System.out.println("Customer ID: " + customerId);
  System.out.println("Order ID: " + orderId);
  System.out.println("Products: ");

  for (int i = 0; i < products.length; i++) {
   if (i == products.length - 1)
    System.out.println(products[i].getName());
   else
    System.out.print(products[i].getName() + ", ");
  }
  System.out.println("Total Price: $" + (Math.round(totalPrice*100)/100.00));
  //Rounding to the second decimal place.
 }
}