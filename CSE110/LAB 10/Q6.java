import java.util.*;
public class Q6{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int size=input.nextInt();
  int[] arr = new int[size];
  for(int i=0;i<arr.length;i++){
      arr[i]=input.nextInt();
  }
  for(int i=0;i<arr.length-1;i++){
    for(int j=i+1;j<arr.length;j++){
      if(arr[i]>arr[j]){
      int temp=arr[j];
      arr[j]=arr[i];
      arr[i]=temp;
      }
  }
}
  int meloc,me;
  if(size%2!=0){
  meloc=(size/2);
  System.out.println(arr[meloc]);
  }
  else{
  meloc=(size/2);
  me=(arr[meloc-1]+arr[meloc])/2;
  System.out.println(me);
  }

}
}