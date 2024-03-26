/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author xxg8089
 */
public class DSA_Quiz4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        while(true){
            String input = myScanner.nextLine();
            System.out.println(palindromeEvaluator(input));
        }
    }
    
    public static boolean palindromeEvaluator(String input){
        if(input.equals(" ")){
            return true;
        }
        
        Stack stack = new Stack();
        Queue queue = new Queue();
        
        String target = input.toLowerCase();
        
        for(int i = 0; i < input.length(); i ++){
            char value = target.charAt(i);
            
            if((value>= 'a' && value <= 'z')){
                stack.push(value);
                queue.enqueue(value);
            }
        }
        
        while(!stack.isEmpty()){
            if(stack.pop() != queue.dequeue()){
                return false;
            }
        }
        return true;
    }
}
