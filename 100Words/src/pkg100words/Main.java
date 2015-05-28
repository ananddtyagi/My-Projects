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
        
 
     
        //every fifth word to upper
        for(c = 0; c != (l-1) ; c++){           
            if((c+1) % 5 == 0){
                words[c] = words[c].toUpperCase();
            } else {
                words[c] = words[c].toLowerCase();
            }
            System.out.println(words[c]);
            c++;
        }
                  
        
    }
    
}
