import java.util.*;
public class Q9Corrected{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[10];
  for(int i=0;i<arr.length;i++){
  arr[i]=input.nextInt();
  }
  System.out.println("How you want to sort?");
  System.out.println("1) only numbers at odd positions 2) only numbers at even positions 3) all numbers");
  int select =input.nextInt();
  if(select == 1){
  for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
      if((arr[i]<arr[j]) && i%2!=0 && j%2!=0){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      }
  }
  }
  }
  else if(select==2){
     for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
      if((arr[i]<arr[j]) && i%2==0 && j%2==0){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      }
  }
  }
  }
  else if(select==3){
   for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
      if((arr[i]<arr[j])){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      }
  }
  }
  }
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
}
}