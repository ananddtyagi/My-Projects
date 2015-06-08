/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package text.analysis;

import java.util.Scanner;

/**
 *
 * @author 17tyagia
 */

import java.util.*;

public class TextAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter something");
        
        ArrayList<String> list = new ArrayList<>();
        
        String temp;
        
        //puting the lines into separate strings
        while (!(temp = a.nextLine()).equals("0")) {
            list.add(temp);            
        }
           
        //takes out all the puctuation
        int i;
        for(i = 0; i < list.size(); i++){    
            list.add(i, list.remove(i).replaceAll("[^a-zA-Z\\s]", "").replaceAll("\\s+", " "));           
        }
               
        int asc;
        int numOfLet[] = new int[26];
             
        for(i = 0; i < list.size() ;i++){         
            temp = list.get(i).substring(i, i+1);
            temp = temp.toUpperCase();
            asc = (int)temp.charAt(0);
    
            numOfLet[asc - 65]++;
            ;
        }
        
         System.out.println(numOfLet[0]);
    }
    
}
