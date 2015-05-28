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
        
        //TELL MR.F THAT I HAVE THE AP BOOK!!!
        //TELL MR.F THAT I HAVE THE AP BOOK!!!
        //TELL MR.F THAT I HAVE THE AP BOOK!!!
        //TELL MR.F THAT I HAVE THE AP BOOK!!!
        
        System.out.println("Please enter your password. It must have between 8 and 20 characters (inclusive), "
                + "1 U/C, 1 L/C, 1 number, and it cannot start with a number.");
        Scanner p = new Scanner(System.in);
        String pass;
        String leng, upper, lower, num, numStart;
        boolean passC = false;
        
        while(passC == false){ //if it does not meet the requirements then the person can try again.

        pass = p.next();
        leng = ""; upper = ""; lower = ""; num = ""; numStart = "";
        passC = true;  
        
        //checking if it is too short or too long
        if(8 > pass.length()){
            leng = "Your Password is too short. ";
            passC = false;
        }
        if(pass.length() > 20){
            leng = "Your Password is too long. ";
            passC = false;
        }
        
        /*checking if it is equal to when all the characters are upper or lower case to see
          if there are no upper or lower case letters
        */
        int ascLow = 0;
        int ascHigh = 0;
        int ascPass = 0;
        
        for(int i = 1; i != pass.length(); i++){
            ascLow += (int)pass.toLowerCase().charAt(i);
            ascHigh += (int)pass.toUpperCase().charAt(i);
            ascPass += (int)pass.charAt(i);
        }

        if(ascPass == ascLow){ //if the value is the same as when all the numbers are lower case it means that there are no upper case letters
            upper = "Your Password does not contain an upper case letter. ";      
            passC = false;
        }
        if(ascPass == ascHigh){ //other way around
            lower = "Your Passowrd does not contain an lower case letter. ";
            passC = false;
        }
        
        //Checking to see if there are any numbers (the ".*\\d+.*" does that)
        if(pass.matches(".*\\d+.*")){
        }else{
            num = "Your Password does not contain a number. ";
            passC = false;
        }

        //checking to see if it starts with a number
        if(pass.substring(0,1).matches(".*\\d+.*")){
            numStart = "Your Password cannot start with a number. ";
            passC = false;
        }
        
        if(passC == false){
            System.out.println(leng + upper + lower + num + numStart+ "\n" + "\n" 
                    + "Your password did not meet the requirements, please try again");
        }else{
            System.out.println("Your password meets all the requirements.");
            passC = true;
        }
        
        }
       
        
    }
    
}
