/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringpractice;

/**
 *
 * @author 17tyagia
 */
public class FoodOrder {
    
   
    
    public static int OrderUnderstand(String [] foods, int numElements){
        
       int shortL = 0;
       int c = 1;
       
       while(c != numElements){
           if(foods[c].length() < foods[c-1].length()){
               shortL = foods[c].length();
           }
           else {
               shortL = foods[c-1].length();
           }
           c++;
           
           System.out.println(shortL);
       }
       
       System.out.println(shortL);
       
       return c;
    }
   
}
