/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package integer.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 17tyagia
 */
public class IntegerRead {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        File num = new File("Numbers.txt");
        
        //print out the numbers
        Scanner a = new Scanner(num);
        a.useDelimiter(",");
        
        int c = 1;
       
        while(a.hasNextInt()) {
            System.out.print(a.next()); 
            System.out.print(", ");
            
            if (c % 8 == 0){
                System.out.println("");
            }
            c++;   
        }
        
        a.close();
        
        //largest number
        Scanner b = new Scanner(num);
        
        c = 0;
        int l = 0;
        
        while(b.hasNextInt()){
            
           
            
        }
        
      
    }
   
}
   
