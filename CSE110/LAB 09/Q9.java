import java.util.*;
public class Q9{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[10];
  for(int i=0;i<arr.length;i++){
      arr[i]=input.nextInt();
  }
  int value=input.nextInt();
  for(int i=0;i<arr.length;i++){
    if(value == arr[i]){
    System.out.println("Yes");
    break;
    }
    else{
    System.out.println("No");
    break;
    }
  }
}
}