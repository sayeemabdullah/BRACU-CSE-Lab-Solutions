import java.util.*;
public class Q7{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[10];
  for(int i=0;i<arr.length;i++){
      arr[i]=input.nextInt();
  }
  for(int i=arr.length-1;i>=0;i--){
      if(arr[i]%2==0){
    System.out.println(arr[i]);
    break;
    }
  }
}
}