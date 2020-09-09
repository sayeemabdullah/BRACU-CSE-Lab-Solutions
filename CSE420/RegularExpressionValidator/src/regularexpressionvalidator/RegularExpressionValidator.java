/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpressionvalidator;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Sayeem Md Abdullah
 */
public class RegularExpressionValidator {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)  throws IOException {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        String[] regexArray = new String[n];
        for(int i=0;i<n;i++){
            regexArray[i] = input.next();
        }
        
        int l = input.nextInt();
        String[] stringArray = new String[l];
        for(int i=0;i<l;i++){
            stringArray[i] = input.next();
        }
        
        for(int i=0;i<l;i++){
            final String in = stringArray[i];
            boolean found = false;
        for(int j=0;j<n;j++){
            final Pattern pattern = Pattern.compile(regexArray[j]);
        if (pattern.matcher(in).matches()) {
            System.out.println("YES, " + (j+1));
            found = true;
            break;
        }
        }
        if(found==false){
        System.out.println("NO, 0");
        }
        }
    }
    
}
