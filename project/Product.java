public class Product {
 
 //Attributes
 private int productID;
 private String name;
 private float price;

 //Constructors
 public Product(int productID, String name, float price){
   this.productID = productID;
   this.name = name;
   this.price = Math.abs(price);
 }

 //Getters
 public int getProductID(){
   return productID;
 }
 public String getName(){
   return name;
 }
 public float getPrice(){
   return price;
 }

//Setters
 public void setProductID(int productID){
   this.productID = productID;
 }
 public void setName(String name){
   this.name = name;
 }
 public void setPrice(float price){
  this.price = Math.abs(price);
 }
}