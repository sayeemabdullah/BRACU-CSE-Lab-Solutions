import java.util.*;
public class Q2{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int k=1;
  while(k==1){
  k++;
  String str = input.next();
  int confirm=0;
  for(int i=0;i<str.length();i++){
    for(int j=0;j<i;j++){
      if(str.charAt(i)==(str.charAt(j))){
      System.out.println("You have entered same alphabet multiple times in the word "+str+".Please enter another word.");
      confirm++;
      break;
      }
  }
    if(confirm==1){
      k=1;
      break;
    }
    System.out.println("You have entered "+str+".");
}
}
}
}