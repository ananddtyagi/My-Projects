/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.practice.lab.pkg1;

/**
 *
 * @author AnandTyagi
 */
public class ArraysPracticeLab1 {

    /**
     * @param args the command line arguments
     */
    static int [] prim;
    static String[] imm;
    static  Date [] date;
    
    public static void main(String[] args) {        
        prim = new int[2];
        prim[0] = 1;
        prim[1] = 2;
        System.out.println(prim[0]);
        ChangeElement(prim[0]);
        System.out.println(prim[0]);    
        
        imm = new String[2];
        imm[0] = "Joe";
        imm[1] = "sally";
        System.out.println(imm[0]);
        ChangeElement(imm[0]);
        System.out.println(imm[0]);
        
        date = new Date[2];
        date[0] = new Date();
        date[1] = new Date();
        
        System.out.println(date[0]);
        ProcessMutable(date[0]);
        System.out.println(date[0]);     
        
    }
    
    public static void ProcessPrimitive(int [] x){
        ChangeElement(x[0]);
    }
    public static void ProcessMutable(Date [] x){
        ChangeElement(x[0]);
    }
    public static void ProcessImmutable(String [] x){
        ChangeElement(x[0]);
    }
     
    public static void ChangeElement(int x){
        x = 2;
    }
    
    public static void ChangeElement(String x){
        x = "bob";
    }
    
    public static void ChangeElement(Date x){
        x.setDay(3);          
    }
    
}
