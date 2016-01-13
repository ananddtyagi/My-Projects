/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_container;

/**
 *
 * @author AnandTyagi
 */
public class Container <T1>{
    
    private T1 t1;
    
    public Container(T1 t1){
        this.t1 = t1;       
    }
    
    public T1 gett1(){
        return t1;
    }
    
    public String toString(){
        return t1.toString();
    }
    
    
    
}
