import java.util.*;
public class Q7{
  public static void main (String args[]){
    Scanner input = new Scanner(System.in);
    String s0 ="Dhaka is the capital of Bangladesh"; 
    String s1 ="Dhaka";
    String s2 ="dhaka";
    String s3 ="Dhaka";
    String s4 ="Bangladesh";
    String s5 ="       Dhaka is the city of Mosques       ";
    String s6 ="The End";
    
    //7a) compareTo
    //Output will be zero if it is equal
    System.out.println("CompareTo :");
    System.out.println(s1.compareTo(s1));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.compareTo(s4));
    System.out.println();
    
    
    //7b) compareToIgnoreCase
    //s1 is equal to s2 as it is ignoring the case
    System.out.println("CompareToIgnoreCase :");
    System.out.println(s1.compareToIgnoreCase(s1));
    System.out.println(s1.compareToIgnoreCase(s2));
    System.out.println(s1.compareToIgnoreCase(s3));
    System.out.println(s1.compareToIgnoreCase(s4));  
    System.out.println();
    
    
    //7c) startsWith
    // Output will be "true" if it matches or else "false"
    System.out.println("startsWith :");
    System.out.println(s1.startsWith("Dha"));
    System.out.println(s1.startsWith("dha"));
    System.out.println();
    
    
    //7d) endsWith
    // Output will be "true" if it matches or else "false"
    System.out.println("endsWith :");
    System.out.println(s1.endsWith("ka"));
    System.out.println(s1.endsWith("desh"));
    System.out.println();
    
    
    //7e) equals
    // Output will be "true" if they are equal or else "false"
    System.out.println("equals :");
    System.out.println(s1.equals(s1));
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));  
    System.out.println();
    
    
    //7f) equalsIgnoreCase
    //s1 is equal to s2 as it is ignoring the case
    System.out.println("equalsIgnoreCase :");
    System.out.println(s1.equalsIgnoreCase(s1));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.equalsIgnoreCase(s3));
    System.out.println(s1.equalsIgnoreCase(s4));  
    System.out.println();
    
    
    //7g) indexOf
    System.out.println("indexOf :");
    System.out.println(s0.indexOf("Bangladesh"));
    System.out.println(s0.indexOf("Dhaka"));
    System.out.println(s0.indexOf('i'));
    System.out.println(s1.indexOf(s1));
    System.out.println(s1.indexOf(s2));
    System.out.println(s1.indexOf(s3));
    System.out.println(s1.indexOf(s4));  
    System.out.println();
    
    
    //7h) lastIndexOf
    System.out.println("lastIndexOf :");
    System.out.println(s0.lastIndexOf("Bangladesh"));
    System.out.println(s0.lastIndexOf("Dhaka"));
    System.out.println(s0.lastIndexOf('h'));
    System.out.println(s0.lastIndexOf('D'));
    System.out.println(s0.lastIndexOf('a'));
    System.out.println(s1.lastIndexOf(s1));
    System.out.println(s1.lastIndexOf(s2));
    System.out.println(s1.lastIndexOf(s3));
    System.out.println(s1.lastIndexOf(s4));  
    System.out.println();
    
    
    //7i) length
    System.out.println("length :");
    System.out.println(s0.length());
    System.out.println(s1.length());
    System.out.println();
    
    
    //7j) replace(char oldChar, char newChar)
    System.out.println("replace(char oldChar, char newChar) :");
    System.out.println(s0.replace('i', 'X'));
    System.out.println(s0.replace('a', 'A'));
    System.out.println(s0.replace("Dhaka", "Noakhali"));
    System.out.println();
    
    
    //7k) substring
    System.out.println("substring :");
    System.out.println(s0.substring(2,9));
    System.out.println(s0.substring(2));
    System.out.println();
    
    
    //7l) toCharArray
    System.out.println("toCharArray :");
    char[] ch=s0.toCharArray();
    System.out.println(ch[4]);
    System.out.println(ch[7]);
    System.out.println();
    
    
    //7m) toLowerCase
    System.out.println("toLowerCase :");
    System.out.println(s0.toLowerCase());
    System.out.println(s0.toLowerCase());
    System.out.println();
    
    
    //7n) toUpperCase
    System.out.println("toUpperCase :");
    System.out.println(s0.toUpperCase());
    System.out.println(s0.toUpperCase());
    System.out.println();
    
    
    //7o) trim
    System.out.println("trim :");
    System.out.println(s0.trim());
    System.out.println(s5.trim());
    System.out.println();
    
    
    //7p) valueOf
    System.out.println("valueOf :");
    System.out.println(String.valueOf(s1));
    System.out.println(String.valueOf(s6));
    System.out.println();
  }
}