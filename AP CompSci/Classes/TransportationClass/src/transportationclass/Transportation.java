/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportationclass;

/**
 *
 * @author AnandTyagi
 */
public abstract class Transportation {
    private double dist;
    private int src, dest;
    
    public double getDist(){
        return dist;
    }
    
    public double getDest(){
        return dest;
    }
    
    public double getSrc(){
        return src;
    }
    
    public abstract void calcTime();
    
    public abstract void calcCost();
    
}
