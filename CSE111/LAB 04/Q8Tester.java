import java.util.*;
public class Q8Tester{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  Q8 q = new Q8();
  q.setName("Sayeem Abdullah");
  System.out.println(q.getName());
  q.setID("17101009");
  System.out.println(q.getID());
  q.setAddress("Mohammadpur");
  System.out.println(q.getAddress());
  q.setCGPA(3.65);
  System.out.println(q.getCGPA());
}
}