/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodingChecklist;

import java.util.HashSet;

/**
 *
 * @author josep
 */
public class LinkedSet<T> {
    private HashSet<T> set;
    
    public LinkedSet(){
        set = new HashSet<>();
    }
    
    public void add(T element){
        set.add(element);
    }
    
    public boolean remove(T element){
        return set.remove(element);
    }
    
    public boolean contains(T element){
        return set.contains(element);
    }
    
    public boolean isEmpty(){
        return set.isEmpty();
    }
    
    public int size(){
        return set.size();
    }
}
