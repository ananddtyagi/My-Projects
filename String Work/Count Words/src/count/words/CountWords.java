/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class CountWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("myFile.txt");
        Scanner myFile = new Scanner (file);
        myFile = myFile.useDelimiter(" ");
        ArrayList<String> words = new ArrayList<>();
        String longest = "";
        int numWords = 0, numChar = 0, average = 0, i;
        
        for(i = 0; myFile.hasNext(); i++){
            words.add(myFile.next().replaceAll("[^a-zA-Z\\s]", ""));
            System.out.println(words.get(i));
            if(longest.length() < words.get(i).length()){
                longest = words.get(i);
            }
            numWords++;
            numChar += words.get(i).length();
            
        }
        
        average = numChar / i;
        
        System.out.println("There were " + numWords + " words in the file" + "\n" +
                 "There were " + numChar + " characters in the file" + "\n" +
                        "The longest word in the file is " + longest + "\n" + 
                        "The average length of a word in the file is " + average); 
    }
    
}
