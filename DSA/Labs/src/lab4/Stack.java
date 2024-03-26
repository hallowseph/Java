/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB4;

/**
 *
 * @author xxg8089
 */
public class Stack <E>{

    private final int INITIAL_CAPACITY = 200;
    private int numElements;
    private E[] elements;

    public Stack() {
        numElements = 0;
        elements = (E[]) (new Object[INITIAL_CAPACITY]);
    }

    public boolean push(E object) {
        if (numElements < INITIAL_CAPACITY) {
            elements[numElements++] = object;
            return true;
        }
        return false;
    }

    public E pop() {
        if(numElements > 0){
            E topElement = elements[numElements-1];
            elements[numElements-1] = null;
            numElements--;
            return topElement;
        }
        return null;
    }

    public boolean isEmpty() {
        return numElements == 0;
    }
}
