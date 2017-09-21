/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haters;

import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class Haters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] empty = new String[7];
        
        empty[0] = "You suck";
        empty[1] = "You are going to community college";
        empty[2] = "You're a nobody";
        empty[3] = "You're worthless";
        empty[4] = "You're stupid";
        empty[5] = "You can't do anything";
        empty[6] = "You'll never be successful";
        
        Scanner better = new Scanner(System.in);
        
        int thoughts;
        boolean angry = false;
        boolean sad = false;
        boolean lonely = true;
        boolean frustrated = false;
        boolean ignorant = false;
        
        while(angry || sad || lonely || frustrated || ignorant){
            System.out.println("Say something nice :)");
            better.nextLine();
            thoughts = (int)(Math.random()  * (7));
            
            System.out.println(empty[thoughts]);
          
            
        }
        
        
    }
    
}
