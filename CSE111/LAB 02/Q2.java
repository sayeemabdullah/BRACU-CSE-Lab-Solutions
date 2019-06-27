import java.util.*;
public class Q2{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[10];
 
  for(int i=0;i<arr.length;i++){
  arr[i]=input.nextInt();
   System.out.print("You have entered ");
  for(int j=0;j<=i;j++){
    System.out.print(arr[j]+" ");
}
}
  
}
}