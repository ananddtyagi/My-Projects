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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringPractice {

    /**
     */
    public static Scanner food;
    
    public static void main(String[] args) throws FileNotFoundException {
      
        File foodList = new File("food.txt");
        Scanner food = new Scanner(foodList);
        food.useDelimiter(", ");
        int numElements = 0;
       
        System.out.println("hi1"); //test code
        
        while(food.hasNext()){
            food.next();
            numElements++;
        }
        
        System.out.println("hi1"); //test code
        
        food.close();
        
        food = new Scanner(foodList);
        food.useDelimiter(",");
        
        System.out.println("hi1"); //test code
        
        String [] foods = new String[numElements];
        int c = 0;
        
        System.out.println("hi1"); //test code
        while(food.hasNext()){
            foods[c] = food.next();
            c++;
        }
        
        System.out.println("hi1"); //test code
        
        System.out.println(FoodOrder.OrderUnderstand(foods, numElements));
        
        System.out.println("hi1"); //test code
    }

    
    
}
