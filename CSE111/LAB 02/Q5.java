import java.util.*;

public class Q5{
final static double PI = 3.1416;
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  //System.out.println(PI);
  double I;
  double E = input.nextDouble();
  double R = input.nextDouble();
  double L = input.nextDouble();
  double C = input.nextDouble();
  double f = input.nextDouble();
  I=E/(Math.sqrt((Math.pow(R, 2))+(Math.pow(((2*PI*f*L)-(1/(2*PI*f*C))),2))));
  System.out.printf("%.2f",I);
}
}