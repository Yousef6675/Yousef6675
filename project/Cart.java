public class Cart{

 //Attributes
 private int customerId;
 private int nProducts;
 private int counter;
 private Product[] products;
 //Constructors
 public Cart(int customerId, int nProducts){
  this.customerId = Math.abs(customerId);
  this.nProducts = Math.abs(nProducts);
  this.products = new Product[nProducts];
 }
 //Getters
 public int getCustomerId(){
  return customerId;
 }
 public int getNProducts(){
  return nProducts;
 }
 public Product[] getProducts(){
  return products;
 }

 //Setters
 public void setCustomerId(int customerId){
  this.customerId = Math.abs(customerId);
 }
 public void setNProducts(int nProducts){
  this.nProducts = Math.abs(nProducts);
}
 //Methods
 public void addProduct(Product product){
  if(counter < nProducts){
   products[counter]= product;
   counter++;
  }
  else{
   System.out.println("Cart is full already!");
  }
 }
 public void removeProduct(Product product){
  for(int i=0; i<=counter; i++){
   if(products[i].getProductID() == product.getProductID()){
    products[i]= null;
    counter--;
   }
  }
 }
 public float calculatePrice(){
  float totalPrice=0f;
  for(int i=0; i<products.length; i++){
   totalPrice+= products[i].getPrice();
  }
  return totalPrice;
 }

 public Order placeOrder(){
  return new Order (customerId, products, calculatePrice ());
 }
}