/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodingChecklist;

import java.util.LinkedList;

/**
 *
 * @author josep
 */
public class LinkedQueue<T> {
    private LinkedList<T> queue;
    
    public LinkedQueue(){
        queue = new LinkedList<>();
    }
    
    public void enqueue(T element){
        queue.addLast(element);
    }
    
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        return queue.removeFirst();
    }
    
    public T first(){
        if(isEmpty()){
            return null;
        }
        return queue.getFirst();
    }
    
    public boolean contains(T element){
        return queue.contains(element);
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public int size(){
        return queue.size();
    }
    
}
