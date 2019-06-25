import java.util.*;
public class Q11{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  
  for(int value=40;value<=50;value++){
  int count=0;
  for(int i=1;i<=value;i++){
  if(value%i==0){
  count++;
  }
  }
  if(count==2){
    System.out.println(value+" is Prime");
  }
  else{
  System.out.println(value+" is !Prime");  
  }
}
}
}