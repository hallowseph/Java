/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABS;

/**
 *
 * @author josep
 */
public class ArrayLinearSearch<T>{
    public static <T> int search(T[] array, T target){
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
