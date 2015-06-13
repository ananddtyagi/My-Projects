/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.names;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class FindNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File listOfNames = new File("Names.txt");
        Scanner theNames = new Scanner(listOfNames);
            theNames = theNames.useDelimiter("\n");
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> namesFound = new ArrayList<>();
        int numOfFound = 0, a, i;
        
        String startLetter;
        System.out.println("Search for names that begin with: ");
        startLetter = input.next();
       
        
        for(i = 0; theNames.hasNext(); i++){
            names.add(theNames.next());
            if(startLetter.equals(Character.toString(names.get(i).charAt(0)))){
                namesFound.add(names.get(i));
                numOfFound++;
            }
        }
        
        
        if(numOfFound == 0){
            System.out.println("There were no names that started with the letter " + startLetter);
        }else{
            System.out.println("The following names matched the search for " + startLetter);
            
            for(i = 0; i < namesFound.size(); i++){
                System.out.println(namesFound.get(i));
            }
            
            System.out.println("There were " + i + " names");
        }
        
    }
    
}
