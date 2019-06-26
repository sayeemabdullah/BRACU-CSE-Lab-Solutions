import java.util.*;
public class Q16{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int row = input.nextInt();
  for(int i=1;i<=row;i++){
    for(int j=1;j<=i;j++){
      if(i<row){
      if(j==1 || j==i){
      System.out.print("*");
      }
      else{
      System.out.print(' ');
      }
      }
      else{
      System.out.print("*");
      }
  }
    System.out.println();
}
}
}