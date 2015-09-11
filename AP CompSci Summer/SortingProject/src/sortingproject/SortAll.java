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
public abstract class SortAll 
                                extends SortingProject
                                    implements Comparable{
    static int numE;
    public SortAll(){
        
    }
    
    public SortAll(Object [] a, int c){
        super();
        numE = c;
        
        bubbleSort(a);
        
    }

    static public <E extends Comparable<E>>  void bubbleSort(E [] s){
        E temp = null;
        
        for(int i = 0; i < (numE - 1); i++){
            if(s[i].compareTo(s[i + 1]) < 1){
                temp = s[i];
                s[i] = s[i + 1];
                s[i + 1] = temp;
            }
        }
        for(Object x : s){
            System.out.println(x);
        }
    }


}
