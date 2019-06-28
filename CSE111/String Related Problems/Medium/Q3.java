import java.util.*;
public class Q3{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  String str1 = input.next();
  String str2 = input.next();
  System.out.println(str1.concat(" ").concat(str2));
  String temp=str1.concat(str2);
  int counter=0;
  for(int i=0;i<temp.length();i++){
    counter+=(int)temp.charAt(i);
  }
    System.out.println(counter);
}
}