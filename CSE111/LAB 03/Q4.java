import java.util.*;
public class Q4{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  String str = input.next();
  int[]arr = new int[100];
  for(int i=0;i<str.length();i++){
  //System.out.println((int)str.charAt(i));
  arr[(int)str.charAt(i)]++;
  }
  for(int i=65;i<=90;i++){
    System.out.println((char)i+" which is "+i+" was found "+arr[i]+" times");
  }
}
}