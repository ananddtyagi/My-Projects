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
public class Project_Container {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Container [] c = new Container[3];
        
        c[0] = new Container<Integer>(2);
        c[1] = new Container<String>("hello");
        
        for(Container x: c){
            System.out.println(x.gett1());
        }
              
    }
    
}
