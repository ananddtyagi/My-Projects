/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingproject;


import java.util.Arrays;

/**
 *
 * @author AnandTyagi
 */
public class SortAll  extends SortingProject
                                    implements Comparable{
    static int numE;
    public SortAll(){
        
    }
    
    public SortAll(Object [] a, int c){
        super();
        numE = c;
        System.out.println("hello");
        bubbleSort(a);
        
    }

    static public void bubbleSort(Object [] s){
        
        Object temp = null;
        for(int i = 0; i < (numE - 1); i++){
            if(s[i].compareTo(s[i + 1]) < 1){ //not sure of the error. Do not understand how comparable works
                temp = s[i];
                s[i] = s[i + 1];
                s[i + 1] = temp;
            }
        }
        //System.out.println("sdf");
        for(Object x : s){
            System.out.println(x);
        }
    }
    
 
    public int compareTo(Object x){
        if(this.equals(x)){
            return 0;
        } else {
            return 1;
        }
    }

}
