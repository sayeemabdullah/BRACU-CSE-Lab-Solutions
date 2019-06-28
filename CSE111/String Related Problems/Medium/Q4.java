import java.util.*;
public class Q4{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  String str = input.next();

  for(int i=0;i<str.length();i++){
    int counter=0;
    for(int j=0;j<i;j++){
      if(str.charAt(i)==str.charAt(j)){
      counter++;
      break;
      }
    }
    if(counter==0){  
    System.out.print(str.charAt(i));
      }
  }
}
}