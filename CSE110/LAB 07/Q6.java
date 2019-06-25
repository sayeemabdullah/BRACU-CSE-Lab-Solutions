import java.util.*;
public class Q6{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int quantity = input.nextInt();
  for(int i=0;i<quantity;i++){
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