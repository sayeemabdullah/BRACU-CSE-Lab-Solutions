import java.util.*;
public class Q7{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int quantity = input.nextInt();
  int value = input.nextInt();
  int sum=0,max=value,min=value;
  sum+=value;
  for(int i=1;i<quantity;i++){
  value = input.nextInt();
  sum+=value;  
  if(value>max){
  max=value;
  }
  else if(value<min){
  min=value;  
  }
  }
  double average = (double) sum/quantity;
  System.out.println("Maximum :"+max);
  System.out.println("Minimum :"+min);
  System.out.println("Average :"+average);
}
}