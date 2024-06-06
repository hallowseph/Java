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
public class ArrayStack<T> {
    private ArrayList<T> stack;
    
    public ArrayStack(){
        stack = new ArrayList<>();
    }
    
    public void push(T element){
        stack.add(element);
    }
    
    public T pop(){
        if(isEmpty()){
            return null;
        }
        return stack.remove(stack.size()-1);
    }
    
    public T peek(){
        if(isEmpty()){
            return null;
        }
        return stack.get(stack.size()-1);
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public int size(){
        return stack.size();
    }
}
