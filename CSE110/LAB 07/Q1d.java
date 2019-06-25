public class Q1d{
public static void main (String args[]){
  int value = 18,temp;
  for(int i=0;i<6;i++){  
    if(i%2==0)
    {
      System.out.print(value + " ");
    }
    else
    {
      temp=value*-1;
      System.out.print(temp + " ");
    }
    value+=9;
  }
}
}