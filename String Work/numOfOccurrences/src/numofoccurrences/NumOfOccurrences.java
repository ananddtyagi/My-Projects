/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numofoccurrences;

import java.util.Scanner;

/**
 *
 * @author 17tyagia
 */
public class NumOfOccurrences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Please enter a word");
        String word = a.nextLine();
        
        System.out.println("Character to Check: ");
        String c = a.next();
        
        int numTimes = 0;
        
        for(int i = 0; i < word.length(); i++){
            
            if(c.equals(word.substring(i, i+1))){
                numTimes++;
            }
            
        }
        
        System.out.println("The Letter " + c + " Occurs " + numTimes + " Times");
    }
    
}
