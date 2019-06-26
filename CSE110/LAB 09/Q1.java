import java.util.*;
public class Q1{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[3];
  int sum=0;
  for(int i=0;i<arr.length;i++){
      arr[i]=input.nextInt();
      sum+=arr[i];
  }
  for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+ " ");
  }
  System.out.println();
  System.out.print(sum);
}
}