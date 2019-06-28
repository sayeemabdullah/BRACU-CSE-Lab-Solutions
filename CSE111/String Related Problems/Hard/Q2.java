import java.util.*;
public class Q2{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  String team = input.next();
  String coach = input.next();
  int teamCount=1,coachCount=1;
  for(int i=0;i<team.length();i++){
      char ch = team.charAt(i);
      int singleDigit =(int)team.charAt(i)-64;
      teamCount*=singleDigit;
  }
  for(int i=0;i<coach.length();i++){
      char ch = coach.charAt(i);
      int singleDigit =(int)coach.charAt(i)-64;
      coachCount*=singleDigit;
  }
  if((coachCount%14)>(teamCount%14)){
  System.out.println("I Am Happy With My Coach");
}
  else{
  System.out.println("I Am Sad With My Coach");
  }
}
}