import java.util.*;
public class Q7{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[10];
  for(int i=0;i<arr.length;i++){
      arr[i]=input.nextInt();
  }
  for(int i=0;i<arr.length;i=i+2){  
    System.out.print(arr[i]+" ");
    }
  for(int i=1;i<arr.length;i=i+2){  
    System.out.print(arr[i]+" ");
    }
}
}