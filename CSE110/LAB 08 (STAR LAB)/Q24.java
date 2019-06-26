import java.util.*;
public class Q24{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int row = input.nextInt();
  for(int i=1;i<=row;i++){
      System.out.print(i);
  }
  for(int i=row-1;i>=1;i--){
      System.out.print(i);
  }
}
}