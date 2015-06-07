/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numletterdigits;

import java.util.Scanner;

/**
 *
 * @author 17tyagia
 */
public class NumLetterDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        String input = a.next();
        int asc, num = 0, ch = 0;
        String inputT = input.replace(" ", ""); // FIX THIS, NEED TO REMOVE SPACES
        System.out.println(inputT);
        
        for(int i = 0; i < inputT.length(); i++){
            asc = (int)inputT.charAt(i);
            
                if(asc >= 48 && asc <= 57){
                    num++;
                } else if((asc >= 65 && asc <= 90) || (asc >= 97 && asc <= 122)) {
                    ch++;
                }    
                       
        }
        
        int numSpaces = 0;
        numSpaces = input.length() - num - ch;
        
        System.out.println("'" + input + "'");
        System.out.println("Letter Count: " + ch);
        System.out.println("Number Count: " + num);
        System.out.println("Total Characters: " + input.length() + " (there is " + numSpaces + " spaces)");
        
        
    }
    
}
