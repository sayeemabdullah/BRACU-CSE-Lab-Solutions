import java.util.*;
public class Q16{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int col = input.nextInt();
  int row = input.nextInt();
  for(int i=1;i<=col;i++){
    for(int j=1;j<=row;j++){  
    System.out.print("*");
  }
    System.out.println();
  }
}
}