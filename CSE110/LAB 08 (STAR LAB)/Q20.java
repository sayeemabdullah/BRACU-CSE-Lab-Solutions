import java.util.*;
public class Q20{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int row = input.nextInt();
  int value = (row*2)-1;
  int temp=1;
  for(int i=1;i<=row;i++){
    for(int j=1;j<=(value/2);j++){
      System.out.print(" ");
  }
  for(int j=1;j<=temp;j++){
    if(i<row){
    if(j==1 || j==temp){
      System.out.print("*");
    }
    else{
      System.out.print(" ");
    }
    }
    else{
     System.out.print("*");
    }
  }
    temp=temp+2;
    System.out.println();
    value=value-2;
  }
}
}