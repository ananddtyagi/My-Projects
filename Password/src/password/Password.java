/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import java.util.Scanner;

/**
 *
 * @author Anupama
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
            String pass;
      
        boolean  numStart, number, upperC, lowerC, passL;
        boolean passFinal = false;
        
        while(passFinal == false){
            
            System.out.println("Please enter your password. It must have between 8 and 20 characters (inclusive), "
                    + "1 U/C, 1 L/C, 1 number, and it cannot start with a number.");
         
            pass = p.next();
            String resp = ""; //this is the string that will give the final response
                 
            numStart = false;
            number = false;
            upperC = false;
            lowerC = false;
            passL = false;
            
            if(pass.length() < 8){
                resp = "Your Password is too short, ";
            }
            else if(pass.length() > 20){
                resp = "Your Password is too long, ";
            }
            else {
                passL = true;
            }

            passFinal = passL;

            int asc;
            asc = (int)pass.charAt(0);

            if(asc >= 65){
                numStart = true; 
            }

            for(int i = 0; i < pass.length(); i++){
                asc = (int)pass.charAt(i);
                
                if(number == false){  
                    if(48 <= asc && asc <= 57){
                      number = true;
                  }
                }
                if(upperC == false){
                    if(65 <= asc && asc <= 90){
                       upperC = true;
                    }
                }
                if(lowerC == false){
                    if(97 <= asc && asc <= 122){
                        lowerC = true;
                    }
                }
            }

            if(numStart == false){
                resp = resp + "Your password cannot start with a number, ";
                passFinal = false;    
            }
            if(number == false){
                resp = resp + "Your psasword does not contain a number, ";
                passFinal = false;  

            }
            if(upperC == false){
                resp = resp + "Your password does not contain an upper case letter, ";
                passFinal = false; 
   
            }
            if(lowerC == false){
                resp = resp + "Your password does not contain a lower case letter, ";
                passFinal = false;

            }

            System.out.println(resp);

            if(passFinal == false){
                System.out.println("Sorry, your password did not meet the requirements, please try again.");
            }else{
                System.out.println("Your password met all the requirements.");
                passFinal = true;
            }
        }   
    }
   
}

