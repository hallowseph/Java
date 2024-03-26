/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

/**
 *
 * @author xxg8089
 */
public class Queue <E> {
    private final int INITIAL_CAPACITY = 200;
    private int head;
    private int tail;
    private int numElements;
    private E[] elements;
    
    public Queue(){
        head = 0;
        tail = 0;
        numElements = 0;
        elements = (E[]) (new Object[INITIAL_CAPACITY]);
    }
    
    public boolean enqueue(E object){
        if(numElements < INITIAL_CAPACITY){
            elements[(tail++ % INITIAL_CAPACITY)] = object;
            numElements++;
            return true;
        }
        return false;
    }
    
    public E dequeue(){
        if(numElements>0){
            E removeElement = elements[head++ % INITIAL_CAPACITY];
            numElements--;
            return removeElement;
        }
        return null;
    }
    
    public boolean isEmpty(){
        return numElements == 0;
    }
}
