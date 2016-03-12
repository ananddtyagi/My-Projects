/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poe;

/**
 *
 * @author AnandTyagi
 */
public class Entry implements Comparable<Entry>{
   private String str;
   private int freq = 1;

   public Entry(String s) {
       str = s;
   }

   public int getFreq() {
       return freq;
   }

   public String getStr() {
       return str;
   }

   public void increment() {
       freq++;
   }

   public String toString() {
       return str + " " + freq;
   }

   public int compareTo(Entry b) {
       return this.getStr().compareTo(b.getStr());
   }
}



