/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupper.s.self.referential.formula;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
/**
 *
 * @author AnandTyagi
 */

public class TupperSSelfReferentialFormula {

    /**
     * @param args the command line arguments
     */
   
    static int [][] tpc;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("TSRF");
        frame.setVisible(true);
        frame.setSize(1050, 310);
        JButton b1 = new JButton();  
        b1.setBounds(20, 180, 300, 100);
        b1.setText("Calc");
        
        frame.add(b1);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw object = new draw();
        
        tpc = new int [105][17];
        
        frame.add(object);
        object.drawing(tpc);
        
        ButtonPressed bp = new ButtonPressed();
        
        bp.BP(b1, object.gettpc());
    }

    
}

