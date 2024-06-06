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
public class ArraySet<T> {
    
    private ArrayList<T> list;
    
    public ArraySet(){
        list = new ArrayList<>();
    }
    
    public void add(T element){
        if(!list.contains(element)){
            list.add(element);
        }
    }
    
    public boolean remove(T element){
        return list.remove(element);
    }
    
    public boolean contains(T element){
        return list.contains(element);
    }
    
    public T get(int index){
        return list.get(index);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public int size(){
        return list.size();
    }
}
