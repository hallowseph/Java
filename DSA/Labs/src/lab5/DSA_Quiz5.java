/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;
/**
 *
 * @author josep
 */
public class DSA_Quiz5 {

    static String[] elements = new String[10];
    static int size = 5;

    public static void main(String[] args) {
        String[] data = {"a", "b", "c", "d", "e"};
        LinkedList list = new LinkedList(data);
        list.printList(false);

        list.toDoublyLinkedList();
        list.printListByLinker();

        guessNumber(1,100);
    }

    public static void guessNumber(int lower_bound, int upper_bound) {
        Scanner scanner = new Scanner(System.in);
        int guess;

        while (lower_bound < upper_bound) {
            guess = (lower_bound + upper_bound) / 2;
            System.out.println("is your number: " + guess + "? (l for lower, h for higher, y for yes)");
            String answer = scanner.nextLine();

            if (answer.equals("l")) {
                upper_bound = guess + 1;
                
            } else if (answer.equals("h")) {
                lower_bound = guess + 1;
            } else if (answer.equals("y")) {
                System.out.println("I guessed the number!");
                break;
            } else {
                System.out.println("Invalid input. please enter 'l', 'h', or 'y'.");
            }
        }
        
    }
}
