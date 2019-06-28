import java.util.*;
public class Q2{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  String str = input.next();
  for(int i=0;i<str.length();i++){
    int ascii = (int)str.charAt(i);
    System.out.print((char)(ascii+1));
  }
}
}