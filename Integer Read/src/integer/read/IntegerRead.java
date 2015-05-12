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
     */
    public static void main(String[] args) throws FileNotFoundException {
        File num = new File("Numbers.txt");
        
        Scanner a = new Scanner(num);
        a.useDelimiter(",");
        
        int c = 1;
        
        while(a.hasNextInt()) {
            System.out.print(a.next()); 
            System.out.print(",");
            
            if (c % 8 == 0){
                System.out.println("");
            }
            c++;
            
    }
        a.close();
            
    }
}
   
