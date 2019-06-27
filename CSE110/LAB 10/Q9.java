import java.util.*;
public class Q9{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int[] arr = new int[15];
  for(int i=0;i<arr.length;i++){
      int number=input.nextInt();
      arr[number]++;
  }
  for(int i=0;i<=9;i++){  
    System.out.println(i+" "+arr[i]);
    }
}
}