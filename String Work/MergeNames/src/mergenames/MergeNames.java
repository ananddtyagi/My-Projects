/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mergenames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 17tyagia
 */
public class MergeNames {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner bN, gN;
    public static void main(String[] args) throws FileNotFoundException {
        File boyNames = new File("boyNames.txt");
        File girlNames = new File("girlNames.txt");
        
         bN = new Scanner(boyNames);
         gN = new Scanner(girlNames);
        
        int l = 0;
        int bNum = 0;
        
        while(bN.hasNextInt()){
            bN.next();
            bNum++;
            l++;
        }
        while(gN.hasNextInt()){
            gN.next();
            l++;
        }

        bN.close();
        gN.close();
        
        bN = new Scanner(boyNames);
        gN = new Scanner(girlNames);
        
        String [] names = new String[l];
        
        int c = 0;
        
        while(c < l){
            if(c < bNum){
                names[c] = bN.next();
            }
            else {
                names[c] = bN.next();
            }
        }
        
        bN.close();
        gN.close();
        
        String temp = "";
        c = 0;
        
        while(c != l){
            if(names[c+1].compareTo(names[c]) < 0) //meaning the next element is higher than the element above it 
            { //Understand what this is doing
                temp = names[c+1];
                names[c+1] = names[c];
                names[c] = temp;
            }
            c++;
        }
        
        c = 0;
        
        while (c != l){
            System.out.println(names[c]);
            c++; 
                        
        }
       
     
    }
    
}
