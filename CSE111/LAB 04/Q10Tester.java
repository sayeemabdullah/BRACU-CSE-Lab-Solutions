import java.util.*;
public class Q10Tester{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  Q10 q1 = new Q10();
  Q10 q2 = new Q10(1.5,"Yellow");
  System.out.println(q1.getRadius());
  System.out.println(q1.getColor());
  System.out.println(q2.getRadius());
  System.out.println(q2.getColor());  
}
}