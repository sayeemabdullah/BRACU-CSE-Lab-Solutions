import java.util.*;
public class Q1{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  String str = input.next();
  int sum=0;
  for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      int singleDigit =Character.getNumericValue(ch);
      sum+=singleDigit;
  }
  if(sum%3==0){
  for(int i=0;i<str.length();i++){
      System.out.print(str.charAt(i));
  }
  System.out.println(" is divisible by 3");
}
  else{
    for(int i=0;i<str.length();i++){
      System.out.print(str.charAt(i));
  System.out.println(" is not divisible by 3");
  }
}
}
}