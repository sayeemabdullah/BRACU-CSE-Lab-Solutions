import java.util.*;
public class Q9Tester{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  Q9 q = new Q9();
  q.setName("Sayeem Abdullah");
  System.out.println(q.getName());
  q.setAccountID("17101009");
  System.out.println(q.getAccountID());
  q.setAddress("Mohammadpur");
  System.out.println(q.getAddress());
  q.setBalance(5050.50);
  System.out.println(q.getBalance());
  q.addInterest();
  System.out.println(q.getBalance());
}
}