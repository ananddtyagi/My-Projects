/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raghav;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class Raghav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   
        // TODO code application logic here
        String[] space;
        space = new String[9];
        space[0] = "1";
        space[1] = "2";
        space[2] = "3";
        space[3] = "4";
        space[4] = "5";
        space[5] = "6";
        space[6] = "7";
        space[7] = "8";
        space[8] = "9";
        
        System.out.println("|1 2 3|");
        System.out.println("|4 5 6|");
        System.out.println("|7 8 9|");
        
        Scanner input = new Scanner(System.in);
        
        String user_sign = "X";
        int spots = 9;
        int i = 0;
        while (i == 0){
            System.out.println("What number spot would you like to go?");
            int in = input.nextInt();
            
            if (in == 1){
                space[0] = user_sign;
                spots -= 1;
            }
            if (in == 2){
                space[1] = user_sign;
                spots -= 1;
            }
            if (in == 3){
                space[2] = user_sign;
                spots -= 1;
            }
            if (in == 4){
                space[3] = user_sign;
                spots -= 1;
            }
            if (in == 5){
                space[4] = user_sign;
                spots -= 1;
            }
            if (in == 6){
                space[5] = user_sign;
                spots -= 1;
            }
            if (in == 7){
                space[6] = user_sign;
                spots -= 1;
            }
            if (in == 8){
                space[7] = user_sign;
                spots -= 1;
            }
            if (in == 9){
                space[8] = user_sign;
                spots -= 1;
            }
            
            int[] choice = new int[15000];
            int count = 0;
            
            Random r = new Random();
            int Low = 1;
            int High = 9;
            choice[count] = r.nextInt(High-Low) + Low - 1;
            
            while (count <= 15000){
                if (space[choice[count]] != "X"){
                    space[choice[count]] = "O";
                    break;
                }
                else{
                    choice[count + 1] = r.nextInt(High-Low) + Low - 1;
                }
                count += 1;
            }
            
            System.out.println("|" + space[0] + " " + space[1] + " " + space[2] + "|");
            System.out.println("|" + space[3] + " " + space[4] + " " + space[5] + "|");
            System.out.println("|" + space[6] + " " + space[7] + " " + space[8] + "|");
            
       
            if(space[0].equals(space[1]) && space[1].equals(space[2]) && space[0].equals(space[2])){
                System.out.println("Winner: " + space[2]);
                break;
            } else if (space[3].equals(space[4]) && space[4].equals(space[5]) && space[3].equals(space[5])){
                System.out.println("Winner: " + space[4]);
                break;
            } else if (space[6].equals(space[7]) && space[7].equals(space[8]) && space[6].equals(space[8])){
                System.out.println("Winner: " + space[7]);
                break;
            } else if (space[0].equals(space[4]) && space[4].equals(space[8]) && space[0].equals(space[8])){
                System.out.println("Winner: " + space[4]);
                break;
            } else if (space[2].equals(space[4]) && space[4].equals(space[6]) && space[2].equals(space[6])){
                System.out.println("Winner: " + space[4]);
                break;
            } else if (space[0].equals(space[3]) && space[3].equals(space[6]) && space[0].equals(space[6])){
                System.out.println("Winner: " + space[3]);
                break;
            } else if (space[1].equals(space[4]) && space[4].equals(space[7]) && space[1].equals(space[7])){
                System.out.println("Winner: " + space[4]);
                break;
            } else if (space[2].equals(space[5]) && space[5].equals(space[8]) && space[2].equals(space[8])){
                System.out.println("Winner: " + space[5]);
                break;
            }
        }
        
        }
    
}

    
    


