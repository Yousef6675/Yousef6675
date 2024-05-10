public class BookProduct extends Product{
  //Attributes
  private String author;
  private String publisher;

  //Constructors
  public BookProduct(int productID, String name, float price, String author, String publisher) {
    super(productID, name, price);
    this.author = author;
    this.publisher = publisher;
  }

  //Getters
  public String getAuthor(){
    return author;
  }
  public String getPublisher(){
    return publisher;
  }

  //Setters
  public void setAuthor(String author){
    this.author = author;
  }
  public void setPublisher(String publisher){
    this.publisher = publisher;
  }
}