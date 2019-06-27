import java.util.*;
public class Q11{
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
    if(j==1 || j==temp){
      System.out.print(j);
  }
    else{
      System.out.print(" ");
    }
  }
    temp=temp+2;
    System.out.println();
    value=value-2;
  }
    temp=1;
    value = (row*2)-1;
    int temp2=value-1;
    for(int i=1;i<=row-1;i++){
    for(int j=1;j<=temp;j++){
      System.out.print(" ");
  }
  for(int j=1;j<temp2;j++){
    if(j==1 || j==temp2-1){
      System.out.print(j);
  }
    else{
      System.out.print(" ");
    }
  }
    temp=temp+1;
    temp2=temp2-2;
    System.out.println();
  }
}
}