public class Q9{
  public String name;
  public String id;
  public String add;
  public double bal;
  public String getName(){
  return name;
  }
  public void setName(String n){
  name=n;
  }
  public String getAccountID(){
  return id;
  }
  public void setAccountID(String i){
  id=i;
  }
  public String getAddress(){
  return add;
  }
  public void setAddress(String a){
  add=a;
  }
  public double getBalance(){
  return bal;
  }
  public void setBalance(double c){
  bal=c;
  }
  public void addInterest(){
  bal+=bal*0.7;
}
}