package org.example;

public class Main5 {
    public static void main(String[] args) {
        String [] []  itemArr = {{"Durian", "45.50", "50"},
                                {"Mango", "30.00", "25"},
                                {"Pineapple", "25.00", "15"}};
        calculateAndPrint(itemArr);
    }

    private static void calculateAndPrint(String[][] itemArr) {
        double amount = 0.0;
        for (String[] strings : itemArr) {
            for (int j = 0; j < strings.length - 2; j++) {
                String itemName = strings[j].toString();
                double quantity = Double.parseDouble(strings[j + 1]);
                double price = Double.parseDouble(strings[j + 2]);
                double total = quantity * price;
                amount += total;

                System.out.println("You have bought " + quantity + " " + itemName + " with total of RM " + total);
            }
        }
        amount = amount * 0.95;
        System.out.println("Total discount rate: 5% ");
        System.out.println("Total amount paid " + amount);
    }
}