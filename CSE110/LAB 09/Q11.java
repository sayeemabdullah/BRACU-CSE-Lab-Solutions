import java.util.*;
public class Q11{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[4];
  for(int i=0;i<arr.length;i++){
      arr[i]=input.nextInt();
     for(int j=0;j<i;j++){
       if(arr[i]==arr[j]){
       System.out.println("Enter different number");
       i--;
       break;
       }
  }
  }
}
}