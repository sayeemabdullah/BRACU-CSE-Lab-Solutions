import java.util.*;
public class Q4{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[5];
  for(int i=0;i<arr.length;i++){
  arr[i]=input.nextInt();
  for(int j=0;j<i;j++){
    if(arr[i]==arr[j]){
    System.out.println(arr[i]+" is already in among the entered numbers");
    i--;
    continue;
    }
  }
  }
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
}
}