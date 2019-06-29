import java.util.*;
public class Q3{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  String str = input.next();
  int stop=0;
  for(int i=0;i<str.length();i++){
    if(((int)str.charAt(i))<=90){
      for(int j=i;j>=stop;j--){
       System.out.print(str.charAt(j));
      }
      stop=i+1;
    }
  }
}
}