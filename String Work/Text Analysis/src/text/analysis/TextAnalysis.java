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
        
        ArrayList<String> list = new ArrayList<>();
        
        String temp;
        
        while (!(temp = a.nextLine()).equals("0")) {
            list.add(temp);            
        }
        
        for(int i = 0; i < list.size();i++){
            
            String stuff = list.remove(i);
            stuff = stuff.replace(",", "");
            stuff = stuff.replace(".", "");
            stuff = stuff.replace("", "");
            list.add(i, stuff);
            
        }
        
        System.out.println(list.get(0));
        
        System.out.println("Please enter something");
        
        
        
    }
    
}
