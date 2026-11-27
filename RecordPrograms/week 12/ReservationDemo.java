class Reservation {

    private int availableSeats = 10;

    synchronized void reserve(String person, int requested) {

        System.out.println(person + " entered.");

        System.out.println("Available seats: " + availableSeats
                + " Requested seats: " + requested);

        if (requested <= availableSeats) {

            System.out.println("Seat Available. Reserve now :-)");

            availableSeats -= requested;

            System.out.println(requested + " seats reserved.");

        } else {

            System.out.println("Requested seats not available :-)");
        }

        System.out.println(person + " leaving.\n");
    }
}

class Person extends Thread {

    private Reservation reservation;
    private int requested;

    Person(String name, Reservation reservation, int requested) {

        super(name);

        this.reservation = reservation;
        this.requested = requested;
    }

    public void run() {

        reservation.reserve(getName(), requested);
    }
}

public class ReservationDemo {

    public static void main(String[] args)
            throws InterruptedException {

        Reservation reservation = new Reservation();

        Person p1 = new Person("Person-1", reservation, 5);
        Person p2 = new Person("Person-2", reservation, 2);
        Person p3 = new Person("Person-3", reservation, 4);

        p1.start();
        p1.join();

        p2.start();
        p2.join();

        p3.start();
        p3.join();
    }
}
