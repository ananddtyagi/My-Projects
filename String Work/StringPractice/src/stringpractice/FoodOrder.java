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
    
   
    
    public static void Order(String [] foods, int numElements){
        
       int c = 0;
       int largest = foods[c].length(), smallest = foods[c].length();
       String large = "";
       while(c != numElements){
           
           if(largest < foods[c].length() || largest == foods[c].length()){
               largest = foods[c].length();  
               large = foods[c];
           }
           
           if(smallest > foods[c].length() || smallest == foods[c].length()){
               smallest = foods[c].length();
           }
           
           
           c++;
           
       }
       
      System.out.println("The Largest Word is " + large);
      
      c = 0;
      
      while(c != numElements){
          if(foods[c].length() >= (c+1)){
            System.out.println(foods[c] + " " + foods[c].charAt(c));
          }
          else{
            System.out.println("Sorry, '" + foods[c] + "' is too short a word");
          }
          c++;
      }
      
    }
   
}
