/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class Poe {

    /**
     * @param args the command line arguments
     */
    

  

    public static void main(String[] args) throws Exception {
      
        File f = new File("poe.txt");
       Scanner s = new Scanner(f);
       ArrayList<Entry> data = new ArrayList<Entry>();

       
       while (s.hasNext()) {
           String word = s.next().toLowerCase().replace(".", "").replace(",", "").replace("!", "").replace("?", "").replace(";", "").replace("-", "");
           for (int i = 0; i <= data.size(); i++) {
               if (data.size() == 0 || i == data.size()) {
                   data.add(i, new Entry(word));
                   break;
               }
               else if (word.equals(data.get(i).getStr())) {
                   data.get(i).increment();
                   break;
               }
           }
       }

       

       int totalWordCount = 0;
       int mostFreqCount = 0;
       String mostFreqWord = new String();
       for (int j = 0; j < data.size(); j++) {
           if (data.get(j).getFreq() > mostFreqCount) {
               mostFreqWord = data.get(j).getStr();
               mostFreqCount = data.get(j).getFreq();
           }
           totalWordCount += data.get(j).getFreq();
       }

       int numUniqueWords = data.size();
       ArrayList<Entry> dup = new ArrayList<Entry>();
       dup.addAll(0, data);


       // PRINT OUT INFORMATION AND SORTED DATA

       System.out.println("The total number of words is " + totalWordCount);
       System.out.println("The number of unique words is " + numUniqueWords);
       System.out.println("The most frequent word is '" + mostFreqWord + "' and occurs " + mostFreqCount + " times");
       System.out.println("The full data:");
       int timeTaken = Calendar.getInstance().get(Calendar.MILLISECOND);
       sortWords(data);
       timeTaken = Calendar.getInstance().get(Calendar.MILLISECOND) - timeTaken;
       for (Entry e : data) {
           System.out.println(e);
       }
       System.out.println();
       System.out.println("Bubble sort took " + timeTaken + " milliseconds");
       timeTaken = Calendar.getInstance().get(Calendar.MILLISECOND);
       Collections.sort(dup);
       timeTaken = Calendar.getInstance().get(Calendar.MILLISECOND) - timeTaken;
       System.out.println("Java sort took " + timeTaken + " milliseconds");

       // GET WORD FROM USER

       s.close();
       Scanner u = new Scanner(System.in);
       System.out.println();
       System.out.println("Word to search for?");
       String searchWord = u.next();

       // SEARCH FOR WORD USING SEQUENTIAL SEARCH

       timeTaken = Calendar.getInstance().get(Calendar.MILLISECOND);
       for (int k = 0; k < data.size(); k++) {
           if (data.get(k).getStr().equals(searchWord.toLowerCase())) {
               break;
           }
       }
       timeTaken = Calendar.getInstance().get(Calendar.MILLISECOND) - timeTaken;
       System.out.println("Sequential search took " + timeTaken + " milliseconds");

       // SEARCH FOR WORD USING BINARY SEARCH

       int minIndex = 0, maxIndex = data.size() - 1;
       String c = new String();
       timeTaken = Calendar.getInstance().get(Calendar.MILLISECOND);
       while (!c.equals(searchWord) && minIndex != maxIndex) {
           int mid = (int)((minIndex + maxIndex) / 2);
           c = data.get(mid).getStr();
           if (c.compareTo(searchWord) > 0)
               maxIndex = mid - 1;
           else if (c.compareTo(searchWord) < 0)
               minIndex = mid + 1;
       }
       timeTaken = Calendar.getInstance().get(Calendar.MILLISECOND) - timeTaken;
       System.out.println("Binary search took " + timeTaken + " milliseconds");

       if (c.equals(searchWord))
           System.out.println("The word '" + searchWord + "' is found and occurred " + data.get((int)((minIndex + maxIndex) / 2)).getFreq() + " times");
       else
           System.out.println("word not found, sorry");

   }

    

 public static void sortWords(ArrayList<Entry> a) {
       for (int i = 0; i < a.size(); i++) {
           for (int j = i + 1; j < a.size(); j++) {
               if (a.get(i).getStr().compareTo(a.get(j).getStr()) > 0) {
                   Entry e = a.get(i);
                   a.set(i, a.get(j));
                   a.set(j, e);
               }
           }
       }
  
}
}
