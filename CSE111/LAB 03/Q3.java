import java.util.*;
public class Q3{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  String str = input.next();
  System.out.println(str.length());
  for(int i=0;i<str.length();i++){
    System.out.println(str.charAt(i)+" : "+(int)str.charAt(i));
  }
}
}