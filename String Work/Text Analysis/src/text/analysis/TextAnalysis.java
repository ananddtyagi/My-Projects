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
        String temp;
        int [] numOfLeng = new int[20];
        int numOfLet[] = new int[26];
        int i;
        int greatest = 0;
             
        while (!(temp = a.nextLine()).equals("0")) {//putting the lines into separate strings
            line = temp;   
            
             //takes out all the punctuation
        i = 0;
        
        for(i = 0; i < line.length(); i++){    
            line = line.replaceAll("[^a-zA-Z\\s]", "");           
        }
        
        int asc;
        
                
        for(int b = 0; b < line.length(); b++){
            
                //adds how many of each letter there is
                temp = temp.toUpperCase();
                asc = (int)temp.charAt(b);
                
                if(asc != 32){
                    numOfLet[asc - 65]++;
                }
            
            }
        
        String []words = line.split(" ");
        
        
        //incriments the amount of each type of each length of word
        for(i = 0; i < words.length; i++){
            if(numOfLeng[i] != 0){
                numOfLeng[words[i].length()]++;
                if(greatest < numOfLeng[words[i].length()]++){
                    greatest = numOfLeng[words[i].length()]++;;
                }
            }
            
            
            
        }
        
    }
        
    //display everything
        
    String letter;
    for(i = 0; i < 26; i++){
        letter = Character.toString((char)(i+65));
        System.out.println(letter + " " +  numOfLet[i] );
    }
    
    for(i = 1; i < greatest; i++){
        System.out.println("Number of " + (i+1) + " lettered words: " + numOfLeng[i]);
    }
    
    
}
}
