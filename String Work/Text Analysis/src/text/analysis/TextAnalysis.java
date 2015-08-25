/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package text.analysis;

import java.util.Scanner;

/**
 *
 * @author 17tyagia
 */

import java.util.*;

public class TextAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter something");
        
        String line;
        int [] numOfLeng = new int[20]; //stores how many of which length there are
        int numOfLet[] = new int[26]; //stores how many of each letter there are
        int i;
        int greatest = 0;
             
        while (!(line = a.nextLine()).equals("0")) {//putting the lines into separate strings
            
             //takes out all the punctuation
        i = 0;
        
        for(i = 0; i < line.length(); i++){    
            line = line.replaceAll("[^a-zA-Z\\s]", "");           
        }
        
        //System.out.println(line); //tester
     
        String []words = line.split(" ");
        
        //incriments the amount of each type of each length of word
        for(i = 0; i < words.length; i++){ 
           
            numOfLeng[words[i].length()]++;

            if(greatest < words[i].length()){
                greatest = words[i].length();
            }  
        }
        
        
        int asc;
        line = line.replace(" ", "");
                
        for(int b = 0; b < line.length(); b++){
            
                //adds how many of each letter there is
                line = line.toUpperCase();
                asc = (int)line.charAt(b);
                
                if(asc != 32){
                    System.out.println(asc); //tester
                    numOfLet[asc - 65]++;
                }
            
            }         
    }
        
    //display everything
        
    String letter;
    for(i = 0; i < 26; i++){
        letter = Character.toString((char)(i+65));
        System.out.println(letter + " " +  numOfLet[i] );
    }
    System.out.println(greatest);
    for(i = 0; i < greatest; i++){
        System.out.println("Number of " + (i+1) + " lettered words: " + numOfLeng[i+1]);
    }
    
    
}
}
