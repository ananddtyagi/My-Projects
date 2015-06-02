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
      
        Scanner a = new Scanner(num);
        a.useDelimiter(",");
        
        int c = 1, l = 0;
        
        while(a.hasNextInt()){
            a.next();
            l++;      
        }
        
        a.close();
          
        //Print out the numbers
        Scanner Numbers = new Scanner(num);
        Numbers.useDelimiter(",");
        
        while(Numbers.hasNextInt()) {
            System.out.print(Numbers.next()); 
            
            if (c < l){
                   System.out.print(", ");
            }
            
            if (c % 8 == 0){
                System.out.println("");
            }
            c++;   
         
        }
        
        //How many numbers
        System.out.println("\n" + "There are " + (l) + " numbers in this list");
               
        Numbers.close();
        
        //largest number
        Scanner largestNum = new Scanner(num);
        largestNum.useDelimiter(",");
        
        int largest = 0, numL;
        
        while(largestNum.hasNextInt()){
            numL = largestNum.nextInt();
          if (largest < numL)
              largest = numL;
            
        }
        
        System.out.println(largest + " is the largest number");
      
        largestNum.close();
    }
   
}
   
