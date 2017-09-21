/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atomictango;

/**
 *
 * @author AnandTyagi
 */
import java.util.*;

public class AtomicTango{

static double p, f, wF, uF, l, fC, tC, h;

   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Position: ");
        p = s.nextDouble();
        System.out.println("Facing: ");
        f = s.nextDouble();
        System.out.println("Weighted Foot: ");
        wF = s.nextDouble();
        System.out.println("Unweighted Foot: ");
        uF = s.nextDouble();
        System.out.println("Leaning: ");
        l = s.nextDouble();
        System.out.println("Foot Contact: ");
        fC = s.nextDouble();
        System.out.println("Thigh Contact: ");
        tC = s.nextDouble();
        System.out.println("Height: ");
        h = s.nextDouble();


        //State initial = new State(p, f, wF, uF, l, fC, tC, h);

//        ArrayList<State> moves = new ArrayList<State>();



      } 
   

     public static int[] newP(int iP){
         int[] x = {(iP - 1) % 8, (iP + 1) % 8};
         return 1,2;

    
  }  

