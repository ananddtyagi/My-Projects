/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

import java.util.Scanner;

/**
 *
 * @author 17tyagia
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter a word");
        String word = a.next();
                 
        if(ifPalindrome(word) == true){
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
        
        
    }
    
    public static boolean ifPalindrome(String word){
        boolean ifPal = false;
        
        String reverse = new StringBuffer(word).reverse().toString();
        
        if(word.equals(reverse)){
            ifPal = true;
        }  
        return ifPal;
    }
}
