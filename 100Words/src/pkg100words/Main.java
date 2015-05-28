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
        int l = 1;
        
        while(wordsFile.hasNext()){
            wordsFile.next();
            l++;
        }
        
        wordsFile.close();
        
        word = new File("Words.txt");
        
        wordsFile = new Scanner(word);
        wordsFile.useDelimiter(" ");
        
        //it now has the capacity to make an array of the 100 words
        String [] words = new String[l];
        
        int c = 0;
        
        while(wordsFile.hasNext()){
            words[c] = wordsFile.next();
            c++;
        }

        c = 0;
        int th = 0;
        int ed = 0;        
        
       
        for(int i = 1; i != (l) ; i++){
           
                if(i % 5 == 0){
                    words[c] = words[c].toUpperCase();
                    if(words[c].startsWith("TH")){
                        th++;
                    }
                    if(words[c].startsWith("ED")){
                        ed++;
                    }
                 
                    words[c] = words[c].replace("A", "*");
                    words[c] = words[c].replace("E", "*");
                    words[c] = words[c].replace("I", "*");
                    words[c] = words[c].replace("O", "*");
                    words[c] = words[c].replace("U", "*");
                                     
                } else {
                    words[c] = words[c].toLowerCase();
                    if(words[c].startsWith("th")){
                        th++;
                    }
                    if(words[c].startsWith("ed")){
                        ed++;
                    }
               
                    words[c] = words[c].replace("a", "*");
                    words[c] = words[c].replace("e", "*");
                    words[c] = words[c].replace("i", "*");
                    words[c] = words[c].replace("o", "*");
                    words[c] = words[c].replace("u", "*");  
                }

                if(i % 20 == 0){
                    if(i != 100){
                        System.out.println(words[c] + ", ");
                    } else {
                        System.out.println(words[c]);
                    }
                }else{
                    System.out.print(words[c] + ", ");
                }
  
            c++;
        }
                  
        System.out.println(th + " words start with 'th'.");
        System.out.println(ed + " words start with 'ed'.");
    }
    
}
