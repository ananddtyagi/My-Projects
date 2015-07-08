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
public class Date {
    int day, month, year;
    
    public Date (){
        day = 1;
        month = 1;
        year = 0001;           
    }
    
    public void setDay(int x){
        day = x;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    
}
