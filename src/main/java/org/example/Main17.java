package org.example;

import java.util.ArrayList;
import java.util.List;

enum Status {
    PENDING, APPROVED, REJECTED;
}

// Transaction class
class Transaction {
    private int id;
    private double amount;
    private Status status;

    // constructor
    public Transaction (int id, double amount) {
        this.id = id;
        this.amount = amount;
        this.status = Status.PENDING;
    }
    // getter setter
    public int getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }
    public synchronized Status getStatus(){
        return status;
    }
    public synchronized void setStatus(Status status) {
        this.status = status;
    }
}

// maker class
class Maker {
    // create transaction
    private List<Transaction> transactionList;
    // constructor
    public Maker (List<Transaction>transactionList) {
        this.transactionList = transactionList;
    }
    // create transaction
    public synchronized void createTransaction(int id, double amount) {
        Transaction ts = new Transaction(id, amount);
        transactionList.add(ts);
        System.out.println("Create transaction with " + ts.getId());
    }
}

class Checker {
    private List<Transaction> transactionList;
    // constructor
    public Checker (List<Transaction>transactionList) {
        this.transactionList = transactionList;
    }
    // review case
    public synchronized void reviewTransaction() {
        for (Transaction ts : transactionList) {
            if (ts.getStatus() == Status.PENDING) {
                ts.setStatus(Status.APPROVED);
            } else {
                ts.setStatus(Status.REJECTED);
            }
            System.out.println("Checked case " + ts.getId());
        }
    }
}

public class Main17 {
    public static void main (String [] args) {
        List<Transaction> transactionList = new ArrayList<>();
        Maker maker = new Maker(transactionList);
        Checker checker = new Checker(transactionList);

        Thread makerThread = new Thread(() -> {
            maker.createTransaction(1, 500);
            maker.createTransaction(2, 2000);
            maker.createTransaction(3, 800);
        });

        Thread checkerThread = new Thread(checker::reviewTransaction);

        makerThread.start();
        try {
            makerThread.join(); // wait all maker done
        } catch(Exception e) {
            e.printStackTrace();
        }
        checkerThread.start();
    }
}
