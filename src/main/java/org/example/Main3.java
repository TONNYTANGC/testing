package org.example;

public class Main3 {
    public static void main(String[] args) {
        int num = 100;
        printNum(num);
    }

    public static void printNum(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 7 == 0) {
                System.out.println(i + ": " + "Ta");
            } else if (i % 9 == 0) {
                System.out.println(i + ": " + "Da");
            } else if (i % 10 == 0) {
                System.out.println(i + ": " + "TaDa");
            }
        }
    }
}
