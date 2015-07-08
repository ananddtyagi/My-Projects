/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupper.s.self.referential.formula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author AnandTyagi
 */
public class ButtonPressed {
    
    public ButtonPressed(){
        
    }
     long [] bi = new  long[1785];  
     int c = 0;
     int [] dec = new int[1785];
    public void BP(JButton b1, int [][] tpc){
    
        b1.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
                c = 0;
                
                System.out.println("hello");
                
                System.out.println("bye");
                
                for(int x = 0; x < 105; x++){  
                    for(int y = 16; y > 0; y--){
                          
                        dec[c] = (tpc[x][y] * 2^c);
                        
                        c++;                           
                   }
                }
                    
                
            }
        });
       
    }

}
