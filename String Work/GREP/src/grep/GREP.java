/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class GREP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File GREPsen = new File("GREPsentences.txt");
        Scanner sen = new Scanner(GREPsen);
        Scanner input = new Scanner(System.in);
        sen.useDelimiter("\n");
        boolean found = false;
        String sentence = "", search, line = "";
        int lineNum = 0;
        System.out.println("Enter a word to search for: ");
        search = input.next();
        
        while(sen.hasNext() && found == false){
            sentence = sen.next();     
            lineNum++;
            String [] words = sentence.split(" ");
            
            for (String word : words) {
                if (word.equals(search)) {
                    found = true;
                    line = sentence;
                }
            }                   
        }   
        
        if(found == true){
            System.out.println("Line " + lineNum + ": " + line);   
        } else {
            System.out.println("The word is not present in the document");
        }
        
    }  
}
