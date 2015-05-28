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
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File word = new File("words.txt");
        
        wordsFile = new Scanner(word);
        wordsFile.useDelimiter(" ");
        int l = 1;
        
        while(wordsFile.hasNext()){
            wordsFile.next();
            l++;
        }
        
        //it now has made an array of the 100 words
        String [] words = new String[l];
        
        int c;
         
        //every fifth word to upper
        for(c = 1; c != l; c++){           
            if(c % 5 == 0){
                words[c - 1] = words[c - 1].toUpperCase();
            }
            
            c++;
        }
        
        
        
        
        
        
        
        
        
        
        
                
        
    }
    
}
