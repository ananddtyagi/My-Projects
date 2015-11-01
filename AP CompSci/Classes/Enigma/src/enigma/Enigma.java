/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class Enigma {

    /**
     * @param args the command line arguments
     */
    static char [] alphabet;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        char [] alphabet = new char[26];
        for(int i = 0; i < 26; i++){
            alphabet[i] = (char)(i + 97);
        }
        
        int r = (int)(Math.random() * 10);
        char [] [] rotorMaster = new char [2][26];
        rotorMaster [0] = Rotors(alphabet, r);
        rotorMaster [1] = alphabet;
        System.out.println("rM");
       
        for(char x: rotorMaster[0]){ //test
            System.out.println(x);
        }
        
        
        int [] rotorSettings = new int [4];
        System.out.println("Enter rotor settings");
        for(int i = 0; i < 4; i++){
            rotorSettings[i] = in.nextInt();
        }
   
        char rotor1[][] = new char[2][26];
        rotor1 [0] = Rotors(alphabet, rotorSettings[0]);
        rotor1 [1] = alphabet;
        System.out.println("r1");
        for(char x: rotor1[0]){ //test
            System.out.println(x);
        }
        char rotor2[][] = new char[2][26];
        rotor2 [0] = Rotors(alphabet, rotorSettings[1]);
        rotor2 [1] = alphabet;
        System.out.println("r2");
        for(char x: rotor2[0]){ //test
            System.out.println(x);
        }
        char rotor3[][] = new char[2][26];
        rotor3 [0] = Rotors(alphabet, rotorSettings[2]);
        rotor3 [1] = alphabet;
        System.out.println("r3");
        for(char x: rotor3[0]){ //test
            System.out.println(x);
        }
        char reflector[][] = new char[2][26];
        reflector [0] = Rotors(alphabet, rotorSettings[3]);
        reflector [1] = alphabet;
        System.out.println("ref");
        for(char x: reflector[0]){ //test
            System.out.println(x);
        }
        
        System.out.println("Enter your message");
        String mes = in.next();      
        String re = Encrypt(mes, rotor1, rotor2, rotor3, reflector);
        System.out.println(re);
    }
    
    public static char [] Rotors(char [] alpha, int setting){
        char [] rotor = new char[26];
        boolean [] b = new boolean[26];
        for(int i = 0; i < 26; i++){
            b[i] = false;
        }
        
       int rand = 0;
       int k = 0;
       boolean open = false;
       
       for(int i = 0; i < 26; i++){
           k = rand = (int)(((Math.random() * (26 - 1) + 1) + setting)  % 26); 
           
           if(b[rand] == false){
                rotor[i] = alpha[rand];
                b[rand] = true;
           }
           else{
             k++;  
             open = false;
             while(!open){
                 if((b[k % 26]) == false){
                     open = true;    
                     b[k % 26] = true;
                 } else {     
                    k++;
                 }
             }    
             rotor[i] = alpha[k % 26];
            
            
           }
           
       }
        /*
        char [] rotor = new char[26];
        boolean [] b = new boolean[26];
        for(int i = 0; i < 26; i++){
            b[i] = false;
        }
        
        int rand = 0;
        int i = 0;
           
        while(i < 16){
           rand = (int)(((Math.random() * (26 - 1) + 1) + setting)  % 26);
           if(b[rand] == false){
              rotor[i] = alpha[rand];
              i++;
              b[rand] = true;
           }   
        }   
        
        //shorten the list to letters left to speed up finding new, unused letters
        char [] smallAlpha = new char[10];
        i = 0;
        int x = 0;
        while( i < 10){
            if(b[x] == false){
                smallAlpha[i] = alpha[i];
                i++;
            }
            x++;
        }
        
        i = 0;
        for(int j = 0; j < 10; j++){
            b[j] = false;
        }
        while(i < 10){
           rand = (int)(((Math.random() * (26 - 1) + 1) + setting)  % 26);
           if(b[rand] == false){
              rotor[i + 16] = smallAlpha[i];
              i++;
              b[rand] = true;
           }   
        }  
                */
        
        return rotor;
    } 
    
    public static String Encrypt(String s, char [][] rotor1,  char [][] rotor2, char [][] rotor3, char [][] reflector){
        char c = ' ';
        String re = "";
        int k = 0;
        boolean found = false;

        for(int i = 0; i < s.length(); i++){
            
            c = s.charAt(i);
            found = false;
            k = 0;
            while(!found)
            {
                if(rotor1[0][k] == c){
                    c = rotor1[1][k];
                    found = true;                  
                }
                k++;
            }
            k = 0;
            found = false;
            while(!found)
            {
                if(rotor2[0][k] == c){
                    c = rotor2[1][k];
                    found = true;                  
                }
                k++;
            }
            k = 0;
            found = false;
            while(!found)
            {
                if(rotor3[0][k] == c){
                    c = rotor3[1][k];
                    found = true;                  
                }
                k++;
            }
            k = 0;
            found = false;
            while(!found)
            {
                if(reflector[0][k] == c){
                    c = reflector[1][k];
                    found = true;                  
                }
                k++;
            }
            k = 0;
            found = false;
            while(!found)
            {
                if(rotor3[1][k] == c){
                    c = rotor3[0][k];
                    found = true;                  
                }
                k++;
            }
            k = 0;
            found = false;
            while(!found)
            {
                if(rotor2[1][k] == c){
                    c = rotor2[0][k];
                    found = true;                  
                }
                k++;
            }
            k = 0;
            found = false;
            while(!found)
            {
                if(rotor1[1][k] == c){
                    c = rotor1[0][k];
                    found = true;                  
                }
                k++;
            }
            
            re += Character.toString(c);
        }
    
        return re;
    }
    
    public static void Decrypt(String s){
        
    }
}
