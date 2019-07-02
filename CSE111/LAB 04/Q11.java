//Renamed Book to Q11
public class Q11{
  private String title;
  private String author;
  private double price;
  
  public Q11 (String title, String author, double price){
  this.title=title;
  this.author=author;
  this.price=price;
  }
  public void setTitle(String title){
  this.title=title;
  }
  public void setAuthor(String author){
  this.author=author;
  }
  public void setPrice(double price){
  this.price=price;
  }
  public String getTitle(){
  return title;
  }
  public String getAuthor(){
  return author;
  }
  public String toString(){
  return title+" written by "+author+" which is "+price+"$."; 
  }

}