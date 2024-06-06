/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodingChecklist;

/**
 *
 * @author josep
 */
public class SelectionSort {
    public static<T extends Comparable<T>> void sort(T[]array){
        for(int i = 0; i<array.length-1;i++){
            int minIndex = i;
            for(int j = i+1; j<array.length;j++){
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if(minIndex != i){
                T temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
