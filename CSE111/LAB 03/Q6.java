import java.util.*;
public class Q6{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  String str = input.next();
  String conn ="==THE END==";
  for(int i=0;i<3;i++){
    if(i==1){
    System.out.println(str.concat(conn));
  }
  else{
   System.out.println(str);
  }
  }
}
}