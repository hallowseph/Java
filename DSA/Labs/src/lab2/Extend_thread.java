/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author xxg8089
 */
public class Extend_thread extends Thread {

    int id;
    int[] shared_array;
    boolean done = false;
    int booked = 0;

    public Extend_thread(int id, int[] shared_array) {
        this.id = id;
        this.shared_array = shared_array;
    }

    public void run() {
        for (int i = 0; i < shared_array.length; i++) {
            synchronized (this.shared_array) 
                {
                    book();
                }
            }
        }
    
    public synchronized void book() {
        int i = 0;
        //looking for an empty seat
        for (; i < shared_array.length && shared_array[i] != 0; i++);
        // check the seat available before booking
        if (i < shared_array.length) {
            shared_array[i] = id; //booking
            booked++; //increase number of seats booked
        }
    }
}
