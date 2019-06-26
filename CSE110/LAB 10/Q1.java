import java.util.*;
public class Q1{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[5];
  arr[0]=input.nextInt();
  int max=arr[0];
  for(int i=1;i<arr.length;i++){
      arr[i]=input.nextInt();
      if(arr[i]>max){
      max=arr[i];
      }
  }
  System.out.println(max);
}
}