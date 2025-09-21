package org.example;

class Threads extends Thread {
    private String task;

    Threads(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is preparing by " + Threads.currentThread().getName());
        try {
            Threads.sleep(1000);
        } catch (Exception e){

        }
    }
}

public class Multithreading {
    public static void main(String[]args) {
        Threads thread1 = new Threads("A");
        Threads thread2 = new Threads("B");
        Threads thread3 = new Threads("C");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
