/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalyzer;


import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sayeem Md Abdullah
 */
public class LexicalAnalyzer {
    
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        List<String> keywords = new ArrayList<>();
        keywords.add("Keywords:");

        List<String> identifiers = new ArrayList<>();
        identifiers.add("Identifiers:");

        List<String> numbers = new ArrayList<>();
        numbers.add("Numbers:");

        List<String> otherstuff = new ArrayList<>();
        otherstuff.add("Others:");

        List<String> mathematicaloperators = new ArrayList<>();
        mathematicaloperators.add("Mathematical Operators:");

        List<String> logicaloperators = new ArrayList<>();
        logicaloperators.add("Logical Operators:");

        File f = new File("input.txt");
        Scanner input = new Scanner(f);
        
        Pattern p;
        Matcher m;

        while (input.hasNextLine()) {
            String str = input.nextLine();

            p = Pattern.compile("\\d*\\.?\\d+");
            m = p.matcher(str);
            if (m.find()) {

                numbers.add(m.group());

            }

            String[] keywordsn = new String[4];
            keywordsn[0] = "int";
            keywordsn[1] = "float";
            keywordsn[2] = "if";
            keywordsn[3] = "else";
            for (int i = 0; i < 4; i++) {
                p = Pattern.compile(keywordsn[i]);
                m = p.matcher(str);
                if (m.find()) {
                    keywords.add(m.group());
                }
            }
            p = Pattern.compile("(?!(int|float|String|if|else|double|new|false|true|for|while)\\b)\\b\\w+\\b");
            m = p.matcher(str);
            if (m.find()) {

                  if(identifiers.contains(m.group())==false){
                  
                        identifiers.add(m.group());
                  }
            }
            String[] logical = {">", "<", "==", "<=", ">=", "!="};
            for (int i = 0; i < logical.length; i++) {
                p = Pattern.compile(logical[i]);
                m = p.matcher(str);
                if (m.find()) {

                    logicaloperators.add(m.group());

                }

            }

            String[] mat = {"\\+", "\\-", "\\*", "\\/", "\\%", "\\="};

            for (int i = 0; i < mat.length; i++) {
                p = Pattern.compile(mat[i]);
                m = p.matcher(str);
                if (m.find()) {
                    String u = m.group();
                    if (mathematicaloperators.contains(u)) {
                        break;
                    } else {
                        mathematicaloperators.add(m.group());
                    }
                }
            }
            String[] others = {";", ",", "\\(", "\\)", "\\{", "\\}"};

            for (int j = 0; j < others.length; j++) {
                p = Pattern.compile(others[j]);
                m = p.matcher(str);

                if (m.find()) {
                    String lul = m.group();
                    if (otherstuff.contains(lul)) {
                        break;
                    } else {
                        otherstuff.add(m.group());
                    }

                }

            }

        }
        
        String formattedString = keywords.toString().replace(",", " ").trim();
        System.out.println(formattedString);
        formattedString = identifiers.toString().replace(",", " ").trim();
        System.out.println(formattedString);
        formattedString = mathematicaloperators.toString().replace(",", " ").trim();
        System.out.println(formattedString);
        formattedString = logicaloperators.toString().replace(",", " ").trim();
        System.out.println(formattedString);
        formattedString = numbers.toString().replace(",", " ").trim();
        System.out.println(formattedString);
        formattedString = otherstuff.toString().replace(",", " ").trim();
        System.out.println(formattedString);
        
    }
    
}
