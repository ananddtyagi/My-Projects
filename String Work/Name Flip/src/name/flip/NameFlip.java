/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package name.flip;

import java.util.Scanner;

/**
 *
 * @author 17tyagia
 */
public class NameFlip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter your name (first and last");
        
        String first = a.next();
        String second = a.next();
        
        System.out.println(second + ", " + first);
        
          
    }
    
}
