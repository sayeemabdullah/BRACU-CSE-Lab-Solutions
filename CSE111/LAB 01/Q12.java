import java.util.*;
public class Q12{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int row = input.nextInt();
  int i,j,k;
  for(i=1;i<=row;i++){
    for(k=1;k<=row-i;k++){
      System.out.print(" ");
  }
  for(j=1;j<=i;j++){
      System.out.print((k+j)-1);
  } 
    System.out.println();
  }
}
}