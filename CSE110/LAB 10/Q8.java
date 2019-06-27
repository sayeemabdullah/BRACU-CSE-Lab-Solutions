import java.util.*;
public class Q8{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  String[] arr = new String[10];
  arr[0]="zero"; 
  arr[1]="one"; 
  arr[2]="two"; 
  arr[3]="three"; 
  arr[4]="four"; 
  arr[5]="five"; 
  arr[6]="six"; 
  arr[7]="seven"; 
  arr[8]="eight"; 
  arr[9]="nine"; 
  int index = input.nextInt();
  System.out.print(arr[index]);
}
}