package lab1;

import java.util.Arrays;

/**
 *
 * @author xxg8089
 */
public class Array {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int size = 5;
        int numberToInsert = 4;

        System.out.println("Original Array: " + Arrays.toString(array));

        insertToArray(numberToInsert, array, size);

        System.out.println("Array after insertion: " + Arrays.toString(array));
    }

    public static void insertToArray(int number, int[] list, int size) {
        int index = 0;
        //to find right position for inserting a number and position will be stored in the index
        for (index = 0; index < size && list[index] < number; index++);
        // shift numbers to make space to insert a new number
        for (int i = size - 1; i > index; i--) 
        {
            list[i] = list[i - 1];
        }
        // insert a new number
            list[index] = number;
    }
}
