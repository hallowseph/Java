/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodingChecklist;

/**
 *
 * @author josep
 */
public class InsertionSort {
    public static<T extends Comparable<T>> void sort(T[] array){
        for(int i = 1; i<array.length;i++){
            T key = array[i];
            int j = i - 1;
            while(j >=0 && array[j].compareTo(key)>0){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
