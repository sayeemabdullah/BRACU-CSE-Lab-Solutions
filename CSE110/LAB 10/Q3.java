import java.util.*;
public class Q3{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[5];
  arr[0]=input.nextInt();
  int max=arr[0];
  int maxLoc=0;
  int min=arr[0];
  int minLoc=0;
  for(int i=1;i<arr.length;i++){
      arr[i]=input.nextInt();
      if(arr[i]>max){
      max=arr[i];
      maxLoc=i;
      }
      if(arr[i]<min){
      min=arr[i];
      minLoc=i;
      }
  }
  System.out.println(min+" "+minLoc);
  System.out.println(max+" "+maxLoc);
}
}