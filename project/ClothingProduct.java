public class ClothingProduct extends Product {

 // Attributes
 private String size;
 private String fabric;

 // Constructors
 public ClothingProduct(int productID, String name, float price, String size, String fabric) {
  super(productID, name, price);
  this.size = size;
  this.fabric = fabric;
 }

 // Getters
 public String getSize() {
  return size;
 }

 public String getFabric() {
  return fabric;
 }

 // setters
 public void setSize(String size) {
  this.size = size;
 }

 public void setFabric(String fabric) {
  this.fabric = fabric;
 }
}