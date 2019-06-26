import java.util.*;
public class Q3{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[10];
  for(int i=0;i<arr.length;i++){
      arr[i]=input.nextInt();
  }
  for(int i=arr.length-1;i>=0;i--){
      System.out.println(arr[i]);
  }
}
}