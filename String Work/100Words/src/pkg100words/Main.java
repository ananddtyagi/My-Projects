/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg100words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 17tyagia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner wordsFile;
    static File word;
    
    public static void main(String[] args) throws FileNotFoundException {
        
        word = new File("Words.txt");
        
        wordsFile = new Scanner(word);
        wordsFile.useDelimiter(" ");
        int l = 0;
        String [] words = new String[1000]; //this is the upper bound value. MAX VALUE
        String temp = "";
        
        while(wordsFile.hasNext()){
            temp = wordsFile.next();
            if(temp.equals(" ") || temp.equals("")){
            }else{
                words[l] = temp;
                l++;
            }
        }
        
        wordsFile.close();
        
        int th = 0;
        int ed = 0;         
        String thWords = "", edWords = "";
        
        for(int c = 0; c != (l) ; c++){
                
                    words[c] = words[c].toLowerCase();
                    if(words[c].startsWith("th")){
                        th++;
                        thWords += words[c] + ", ";
                    }
                    if(words[c].endsWith("ed")){
                        ed++;
                        edWords += words[c] + ", ";
                    }
               
                    words[c] = words[c].replace("a", "*");
                    words[c] = words[c].replace("e", "*");
                    words[c] = words[c].replace("i", "*");
                    words[c] = words[c].replace("o", "*");
                    words[c] = words[c].replace("u", "*"); 
                    
                    if((c+1) % 5 == 0){
                        words[c] = words[c].toUpperCase();
                    }
                              

                if((c+1) % 20 == 0){
                    if((c+1) != 100){
                        System.out.println(words[c] + ", ");
                    } else {
                        System.out.println(words[c]);
                    }
                }else{
                    System.out.print(words[c] + ", ");
                }
  
        }
             
        thWords = replaceLast(thWords, ", ", "");
        thWords = replaceLast(thWords, ", ", " and ");
        edWords = replaceLast(edWords, ", ", "");
        edWords = replaceLast(edWords, ", ", " and ");
        
        System.out.println(th + " words, " + thWords + ", start with 'th'.");
        System.out.println(ed + " words, " + edWords + ", start with 'ed'.");
    }
    
    //how does this code work?
    public static String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)"+regex+"(?!.*?"+regex+")", replacement);
    }

}
