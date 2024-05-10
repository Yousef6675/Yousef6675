import java.util.Scanner;

public class EcommerceSystem {
  public static void main(String[] args) {

    // Create Product objects:
   ElectronicProduct smartphone= new ElectronicProduct(1, "smartphone", 599.9f, "Samsung", 1);
   ClothingProduct T_shirt= new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
   BookProduct book= new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X publications");
  
   // Taking User's data:
   int customerId, nProducts;
   String name, address;

   Scanner sc= new Scanner(System.in);
   System.out.println("Welcome to our E-commerce System!");
   System.out.println("Enter your CustomerID: ");
   customerId= sc.nextInt();
   sc.nextLine(); //Consumes the \n character so the next one can read the user input properly.
   System.out.println("Enter you full name: ");
   name= sc.nextLine();
   System.out.println("Enter your address: ");
   address= sc.nextLine();
   System.out.println("Enter the number of products you want to buy: ");
   nProducts= sc.nextInt();
  

 
   Customer customer= new Customer(customerId, name, address);
   // Create a Cart object;
   Cart cart= new Cart(customerId, nProducts);
   // Adding products to the cart:
   int counter=0;
   int choice;
   while(counter < nProducts) {
    System.out.println("Which product you would like to add?\n1. Smartphone   2. T-shirt   3. OOP Book");
    choice= sc.nextInt();
    switch(choice) {
     case 1:
      cart.addProduct(smartphone);
      counter++;
      break;
     case 2:
      cart.addProduct(T_shirt);
      counter++;
      break;
     case 3:
      cart.addProduct(book);
      counter++;
      break;
     default:
      System.out.println("Invalid choice!");
    }
   }

   System.out.println("Do you want to place an order with the current cart?\n1. Place an order\n2. Exit");
   choice= sc.nextInt();
   sc.close();
   switch(choice){
    case 1:
     System.out.println("Order placed successfully!\n");
     System.out.println("Order Details: ");
     cart.placeOrder().printOrderInfo();
     //cart.placeOrder() will create a new Order object and return it.
     //calling printOrderInfo() next will print the order info of the Order object that was just returned.
     break;
    case 2:
     System.out.println("Thank you for using our E-commerce System!");
   }
  
}}