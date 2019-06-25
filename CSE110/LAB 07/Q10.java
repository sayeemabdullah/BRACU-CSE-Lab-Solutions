import java.util.*;
public class Q10{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int value = input.nextInt();
  int count=0;
  for(int i=1;i<=value;i++){
  if(value%i==0){
  count++;
  }
  }
  if(count==2){
    System.out.println("Prime");
  }
  else{
  System.out.println("!Prime");  
  }
}
}