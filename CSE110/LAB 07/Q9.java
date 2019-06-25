import java.util.*;
public class Q9{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int value = input.nextInt();
  int total=0;
  for(int i=1;i<value;i++){
  if(value%i==0){
  total+=i;
  }
  }
  if(total==value){
  System.out.println("Perfect");
}
  else{
  System.out.println("!Perfect");  
  }
}
}