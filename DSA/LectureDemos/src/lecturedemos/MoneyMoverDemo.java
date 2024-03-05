/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturedemos;

/**
 *
 * @author xxg8089
 */
public class MoneyMoverDemo {
    public static void main(String[] args) {
        Account accountA = new Account();
        Account accountB = new Account();
        MoneyMover moneyMover1 = new MoneyMover(accountA, accountB);
        
        Thread thread1 = new Thread(moneyMover1);
        Thread thread2 = new Thread(moneyMover1);
        thread1.start();
        thread2.start();
    }
    
}
