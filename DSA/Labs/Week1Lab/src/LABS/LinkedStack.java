/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABS;

import java.util.LinkedList;

/**
 *
 * @author josep
 */
public class LinkedStack<T> {
    private LinkedList<T> stack;
    
    public LinkedStack(){
        stack = new LinkedList<>();
    }
    
    public void push(T element){
        stack.addLast(element);
    }
    
    public T pop(){
        if(isEmpty()){
            return null;
        }
        return stack.removeLast();
    }
    public T peek(){
        if(isEmpty()){
            return null;
        }
        return stack.getLast();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public int size(){
        return stack.size();
    }    
}
