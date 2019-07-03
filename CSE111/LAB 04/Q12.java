//Renamed Author to Q12
public class Q12{
  private String firstName;
  private String lastName;

  
  public Q12 (String firstName, String lastName){
  this.firstName=firstName;
  this.lastName=lastName;
  }
  public void setLastName (String lastName){
  this.lastName=lastName;
  }
  public void setFirstName (String firstName){
  this.firstName=firstName;
  }
  public String getLastName(){
  return lastName;
  }
  public String getFirstName(){
  return firstName;
  }
  public String toString(){
  return "The author's name is "+firstName+" "+lastName; 
  }

}