/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine.learning;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class MachineLearning {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        File y = new File("Yes.txt");
        File n = new File("No.txt");
        File qs = new File("Questions.txt");
        Scanner yes = new Scanner(y);
        Scanner no  = new Scanner(n);
        Scanner q = new Scanner(qs);
        yes = yes.useDelimiter("\n");
        no = no.useDelimiter("\n");
        q = q.useDelimiter("\n");
        
        
        Scanner resp = new Scanner(System.in);
        String ans;
        
        //prompt
        System.out.println("I will be learning different form of yes and no through"
                + "a series of questions I ask you");
        
        String uQ  = "I do not understand that response. Does that fall under "
                + "1. \"yes\" or 2. \"no\" (Please enter the correct number)"; //uQ = understanding Question
        boolean found = false;
        int qAns;
        while(q.hasNext()){
            questions(q);
            resp.next();
            ans = resp.nextLine();
            found = respAnalysis(ans);
            if(!found){
                System.out.println(uQ);            
                qAns = resp.nextInt(); //qAns = the question's answer
            AddToFile(qAns, ans);
        }
            
        }
  
        //throw exception if they don't follow instructions.
 
    }
       
    public static void questions(Scanner q){
       System.out.println(q.next());
    } 
    
    public static boolean respAnalysis(String ans) throws FileNotFoundException{
        boolean found = false;
        File y = new File("Yes.txt");
        File n = new File("No.txt");
        File qs = new File("Questions.txt");
        Scanner yes = new Scanner(y);
        Scanner no  = new Scanner(n);
        Scanner q = new Scanner(qs);
        yes = yes.useDelimiter("\n");
        no = no.useDelimiter("\n");
        q = q.useDelimiter("\n");
        
        if(!ans.equals("Yes") && !ans.equals("No")){  
            while(yes.hasNextLine()){
                if(yes.nextLine().equals(ans)){
                    found = true;
                }       
            }
            if(!found){
               while(no.hasNextLine()){
                   if(no.nextLine().equals(ans)){
                       found = true;
                   }
               } 
            }
            
        } 
        System.out.println(found);
        return found;
    }
    
    public static void AddToFile(int qAns, String ans){
        if(qAns == 1){
            try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Yes.txt", true)))){
                out.println(ans);
            }
            catch(IOException e){    
            }
        } else if (qAns == 2) {
             try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("No.txt", true)))){
                out.println(ans);
              }
             catch(IOException e){    
             }
        }
    }

}
    

