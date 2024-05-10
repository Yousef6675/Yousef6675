public class Customer{

 //Attributes
 private int customerId;
 private String name;
 private String address;

 //Constructors
 public Customer(int customerId, String name, String address){
   this.customerId = Math.abs(customerId);
   this.name = name;
   this.address = address;
 }

 //Getters
 public int getCustomerId(){
   return customerId;
 }
 public String getName(){
   return name;
 }
 public String getAddress(){
  return address;
 }

 //Setters
 public void setCustomerId(int customerId){
   this.customerId = Math.abs(customerId);
 }
 public void setName(String name){
   this.name = name;
 }
 public void setAddress(String address){
  this.address = address;
 }
}
