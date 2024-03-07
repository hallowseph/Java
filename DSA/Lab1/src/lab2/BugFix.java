/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import static java.util.Collections.list;

/**
 *
 * @author josep
 */
public class BugFix {
    
    public static void main(String[] args) {
        
    }
    //method findInArray() finds a targetValue in the array which is named “list” and returns index of //targetValue in the array. It returns -1 if it cannot find targetValue.
   
private static int findInArray(int[] list, int targetValue) 
    {
        int index = 0;
        
        for(; list[index]!= targetValue && list.length < index ; index++);
        
        if(index <list.length)
            return index;
        return -1; //not found
    }

}
