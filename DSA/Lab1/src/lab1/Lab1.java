/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

/**
 *
 * @author xxg8089
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        diamond(6,6);
    }
    
    public static void repeatlyPrint(int amount,String pattern){
        if(amount>0)
        {
            //print a pattern once
            System.out.println(pattern);
            //recursively call the function itself
            repeatlyPrint(amount-1,pattern);
        }
    }
    
    public static void diamond(int totalHeight, int currentRow){
        //print spaces(outside of diamond)
        //-----------------------------
        //print asterisks and spaces
        //-----------------------------
        System.out.println();
        /*if(----------)
        {
            diamond(----------,---------);
        }*/
        //print spaces
        //-----------------------------
        //print asterisks and spaces
        //-----------------------------
        System.out.println();
    }
}
