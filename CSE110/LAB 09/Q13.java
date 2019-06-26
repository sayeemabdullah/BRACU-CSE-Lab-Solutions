import java.util.*;
public class Q13{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[10];
  int even=0,odd=0,diviadd=0;
  for(int i=0;i<arr.length;i++){
      arr[i]=input.nextInt();
       if(arr[i]%2==0){
         even+=arr[i];
    }
       if(arr[i]%2!=0){
         odd+=arr[i];
    }
       if(arr[i]%5==0){
         diviadd+=arr[i];
    }
  }
  System.out.println(even);
  System.out.println(odd);
  System.out.println(diviadd);
  
}
}