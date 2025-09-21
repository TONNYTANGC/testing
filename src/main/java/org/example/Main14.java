package org.example;

// Create Passenger class with: name, frequentFlyerPoints.
//
//Store passengers in a PriorityQueue sorted by points (highest first).
//
//Implement an interface Boardable with method void boardPassenger().
//
//Simulate boarding by polling from the queue.

import java.util.PriorityQueue;

class Passenger implements Boardable, Comparable<Passenger> {
    String name;
    int frequentFlyerPoints;

    public Passenger(String name, int frequentFlyerPoints) {
        this.name = name;
        this.frequentFlyerPoints = frequentFlyerPoints;
    }

    @Override
    public void boardPassenger() {
        // board passenger
        System.out.println("Boarding " + name);
    }

    @Override
    public int compareTo(Passenger other) {
        return Integer.compare(other.frequentFlyerPoints, this.frequentFlyerPoints);
    }
}

interface Boardable {
    void boardPassenger();
}

public class Main14 {
    public static void main(String[] args) {
        PriorityQueue<Passenger> queue = new PriorityQueue<>(); // FIFO
        queue.add(new Passenger("Alice", 100));
        queue.add(new Passenger("Bob", 50));
        queue.add(new Passenger("Charlie", 200));

        while (!queue.isEmpty()) {
            Passenger passenger = queue.poll();
            passenger.boardPassenger();
        }
    }
}
