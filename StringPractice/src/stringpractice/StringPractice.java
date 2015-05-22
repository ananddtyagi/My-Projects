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
        food = new Scanner(foodList);
        food.useDelimiter(", ");
        int numElements = 0;


        while (food.hasNext()) {
            food.next();
            numElements++;
        }

        food.close();

        food = new Scanner(foodList);
        food.useDelimiter(", ");

        String[] foods = new String[numElements];
        int c = 0;

        while (food.hasNext()) {
            foods[c] = food.next();
            c++;
        }


        FoodOrder.Order(foods, numElements);

    }

}
