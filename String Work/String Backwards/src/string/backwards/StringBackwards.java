/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string.backwards;

import java.util.Scanner;

/**
 *
 * @author 17tyagia
 */
public class StringBackwards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Please enter a word (or a few).");
        String input = a.next();
        String temp = "";
        int leng = input.length();
        String [] output = new String[leng];
        
        int i;
        
        for(i = 0; i < leng; i++){
            temp = input.substring(i, i+1);
            output[leng - 1 - i] = temp;
        }
     
        i = 0;
        for(; i < leng; i++){
            System.out.print(output[i]);
        }
            
        
    }
    
}
