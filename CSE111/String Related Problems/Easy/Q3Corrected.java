import java.util.*;
public class Q3Corrected{
  public static void main (String args[]){
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    for(int i=0;i<str.length();i++){
      int ascii = (int)str.charAt(i);
      if(ascii!=32 && ascii!= 'a'){
        System.out.print((char)(ascii-1));
      }
      else if(ascii=='a'){
       System.out.print("z"); // 'a' shoud be replced by 'z'
      }
      else{
       System.out.print(" ");
      }
    }
  }
}