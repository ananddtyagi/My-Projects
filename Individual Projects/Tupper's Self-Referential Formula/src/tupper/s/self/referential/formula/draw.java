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
/**
 *
 * @author AnandTyagi
 */

public class draw extends JPanel{
    
    Graphics gd;
    int [][] tpc = new int[105][17];
    
    public void drawing(int [][] tpc){
        repaint(0, 0, 1050, 170);
        this.tpc = tpc;
        
   
    }
    
    //making the boxes
 
    @Override
    public void paintComponent(Graphics g){
        
        gd = g;
        int d = 10;
        
        int x = 0;
        for(x = 0; x < 105; x++){
            int y = 0;
            for(y = 0; y < 17; y++){
                if(tpc[x][y] == 0){
                    gd.setColor(Color.white);
                    gd.fillRect(x*d, y*d, d, d);
                    
                } else {
                    gd.setColor(Color.black);
                    gd.fillRect(x*d, y*d, d, d);
                    
                }
                gd.setColor(Color.black);
                gd.drawRect(x*d, y*d, d, d);               
             }            
        }

    addMouseListener(new MouseAdapter() {
                     
                int x = 0;
                int y = 0;
                @Override
                public void mouseClicked(MouseEvent e){
                    int d = 10;
                    System.out.println(e.getX() + " " + e.getY());
                     x = e.getX() / d;
                     y = e.getY() / d;
                    System.out.println(x + " " + y);
                   
                    if(tpc[x][y] == 0){
                        tpc[x][y] = 1;
                    } else {
                        tpc[x][y] = 0;
                    }                  
                    repaint(0, 0, 1050, 170);
                }       
                
            });
             
   
    }
    
    
    public void settpc(int[][] tpc){
        this.tpc = tpc;
    }
    public int[][] gettpc(){
        return tpc;
    }
    
    
    
}
