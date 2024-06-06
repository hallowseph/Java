/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABS;

import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class ArrayQueue<T> {
    private ArrayList<T> queue;
    
    public ArrayQueue(){
        queue = new ArrayList<>();
    }
    
    public void enqueue(T element){
        queue.add(element);
    }
    
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        return queue.remove(0);
    }
    
    public T first(){
        if(isEmpty()){
            return null;
        }
        return queue.get(0);
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public int size(){
        return queue.size();
    }
}
