import java.util.*;
public class Q10{
  public static void main (String args[]){
    Scanner input = new Scanner(System.in);
    int[] arr = new int[10];
    int counter=0;
    for(int i=0;i>=0;i++){
      if(counter==2){
        break;
      }
      counter=0;
      int number=input.nextInt();
      arr[number]++;
      
      for(int j=0;j<arr.length;j++){
        if(arr[j]>2 && arr[j]<5){
          counter++;
        }
        if(counter==2){
          for(int k=0;k<=9;k++){
            if(arr[k]>2 && arr[k]<5){
              System.out.print(k+" ");
            }
          }
          break;
        }
      }
    }   
  }
}