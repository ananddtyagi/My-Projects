/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class Dictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File dictionary = new File("dictionary.txt");
        Scanner wordsAndDefs = new Scanner(dictionary);
        Scanner input = new Scanner(System.in);
        wordsAndDefs = wordsAndDefs.useDelimiter("\n");
        int i, a;
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> defs = new ArrayList<>();
        boolean done = false, wordFound;
        
        for(i = 0; wordsAndDefs.hasNext(); i++){
            if(i % 2 == 0){
                words.add(wordsAndDefs.next());
            } else {
                defs.add(wordsAndDefs.next());
            }
        }
        
        while(done != true){
       
        System.out.println("Which word would you like to search for?");
        String wordSearch = input.next();
        wordFound = false;
        for(a = 0; a < (i/2); a++){
            if(wordSearch.equals(words.get(a))){
                System.out.println("The definition of the word is: " + defs.get(a));
                wordFound = true;
            }
        }
        if(wordFound = false){
            System.out.println("Sorry we could not find your word");
        }
        
        System.out.println("Would you like to search for another word? (yes or no)");
        if(input.next().equals("no")){
            done = true;
        }
        
    } 
    }
}   
 
