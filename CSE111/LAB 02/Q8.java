import java.util.*;
public class Q8{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[10];
  for(int i=0;i<arr.length;i++){
      int number=input.nextInt();
      arr[number]++;
  }
  for(int i=0;i<=9;i++){
    if(arr[i]>2 && arr[i]<5){
    System.out.print(i+" ");
   }
}
}
}