/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encode.decode;

import java.util.Scanner;

/**
 *
 * @author 17tyagia
 */
public class EncodeDecode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter a message");
        String mess = a.nextLine();
        System.out.println("You just typed " + mess);
            
        System.out.println("Enter E to encode, D to decode:");
        String ed = a.next();
        String temp = "";
        int asc = 0;
        
        
        for(int i = 0; i < mess.length(); i++){
            if(ed.equals("E")){
                if(mess.substring(i, i+1).equals(" ")){
                }
                else{
                    asc = (int)mess.charAt(i);
                    temp = String.valueOf(Character.toChars(asc + 1));
                    mess = mess.replace(mess.substring(i, i+1), temp);
                }
            } else {
                if(mess.substring(i, i+1).equals(" ")){
                }
                else{
                    asc = (int)mess.charAt(i);
                    temp = String.valueOf(Character.toChars(asc - 1));
                    mess = mess.replace(mess.substring(i, i+1), temp);
                }
            }            
        }
        
        System.out.println(mess);       
    }
    
}
