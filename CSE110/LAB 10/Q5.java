import java.util.*;
public class Q5{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[5];
  for(int i=0;i<arr.length;i++){
      arr[i]=input.nextInt();
  }
  for(int i=0;i<arr.length-1;i++){
    for(int j=i+1;j<arr.length;j++){
      if(arr[i]<arr[j]){
      int temp=arr[j];
      arr[j]=arr[i];
      arr[i]=temp;
      }
  }
}
  for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]+" ");
  }
}
}