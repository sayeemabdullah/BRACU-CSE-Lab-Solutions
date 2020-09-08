/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailwebchecker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sayeem Md Abdullah
 */
public class EmailWebChecker {
    
    private static final String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final String webRegex = "^(http://|https://)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?$";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       for(int i = 1;i <= n ; i++){
           String value = input.next();
           Pattern p = Pattern.compile(emailRegex);
           Matcher m=p.matcher(value);
           boolean isMatches = m.matches();
           //System.out.println(isMatches);
           if(isMatches==true){
           System.out.println("Email , "+i);
           continue;
           }
           p = Pattern.compile(webRegex);
           m=p.matcher(value);
           isMatches = m.matches();
           if(isMatches==true){
           System.out.println("Website , "+i);
           }
           
       }
    }
    
}
