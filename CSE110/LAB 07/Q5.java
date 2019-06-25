import java.util.*;
public class Q5{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  for(int i=0;i<20;i++){
  int value = input.nextInt();
  if(value%2==0){
  System.out.println("Even");
  }
  else{
  System.out.println("Odd");  
  }
  }
}
}