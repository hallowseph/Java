package lab2;

/**
 *
 * @author xxg8089
 */
public class Extend_threadmain {

    public static void main(String[] args) {

        int[] seats = new int[1000];

        for (int i = 0; i < seats.length; i++) {
            seats[i] = 0; //empty the booking of a seat
        }

        Extend_thread et1 = new Extend_thread(1, seats);
        Extend_thread et2 = new Extend_thread(2, seats);
        Extend_thread et3 = new Extend_thread(3, seats);

        et1.start();
        et2.start();
        et3.start();

        //waiting for all threads to finish
        while (et1.isAlive() || et2.isAlive() || et3.isAlive());

        for (int i = 0; i < seats.length; i++) {
            System.out.print(seats[i] + " ");

            if (i % 10 == 9) {
                System.out.println();
            }
        }
        System.out.println("ET 1 booked: " + et1.booked + " ET 2 booked: " + et2.booked + " ET 3 booked: " + et3.booked + "\nTotal booked: " + (et1.booked + et2.booked + et3.booked));
    }
}
