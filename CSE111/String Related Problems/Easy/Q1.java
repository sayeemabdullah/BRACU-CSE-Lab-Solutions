import java.util.*;
public class Q1{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  String str = input.next();
  char arr[] = str.toCharArray();
  Arrays.sort(arr);
  System.out.println(arr);
  
}
}