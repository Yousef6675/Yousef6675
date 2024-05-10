public class ElectronicProduct extends Product {
  //Attributes
  private String brand;
  private int warrantyPeriod;

  //Constructors
  public ElectronicProduct(int productID, String name, float price, String brand, int warrantyPeriod)
 {
  super(productID, name, price);
  this.brand = brand;
  this.warrantyPeriod = warrantyPeriod;
 }
  //Getters
  public String getBrand(){
    return brand;
  }
  public int getWarrantyPeriod(){
    return warrantyPeriod;
  }

  //Setters
  public void setBrand(String brand){
   this.brand=  brand;
  }
  public void setWarrantyPeriod(int warrantyPeriod){
   this.warrantyPeriod = warrantyPeriod;
  }
 
}