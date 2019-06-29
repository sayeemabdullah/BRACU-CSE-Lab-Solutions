import java.util.*;
public class Q4{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int number = input.nextInt();
  String str = input.next();
  int stop=90-number;
  for(int i=0;i<str.length();i++){
    if(((int)str.charAt(i))>stop){
       int output=65+((90-stop)-1);
       System.out.print((char)output);
      }
    else{
      int output=((int)str.charAt(i))+number;
      System.out.print((char)output);
    }
    }
  }
}