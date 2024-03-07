package lab2;

import static java.util.Collections.list;

/**
 *
 * @author xxg8089
 */
public class BugFix {

    public static void main(String[] args) {
        //target value is found in the array
        int[] array1 = {1, 2, 3, 4, 5};
        int target1 = 3;
        int result1 = findInArray(array1, target1);
        System.out.println("Index of " + target1 + ": " + result1);

        //target value is not found in the array
        int[] array2 = {10, 20, 30, 40 ,50};
        int target2 = 15;
        int result2 = findInArray(array2, target2);
        System.out.println("Index of " + target2 + ": " + result2);
    }
    //method findInArray() finds a targetValue in the array which is named “list” and returns index of //targetValue in the array. It returns -1 if it cannot find targetValue.

    private static int findInArray(int[] list, int targetValue) {
        int index = 0;

        for (; index < list.length && list[index] != targetValue; index++);

        if (index < list.length) {
            return index;
        }
        return -1; //not found
    }

}
