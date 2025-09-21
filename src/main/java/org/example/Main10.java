package org.example;

public class Main10 {
    public static void main(String[] args) {
        printTriangle(2);
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) { // iterate through each row
            for (int j = 1; j <= n - i; j++) { // iterate through each column N-1 = 1
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // print stars for each row when i = 1, k =1 when i = 2, k = 2 so each column will have number of stars equal to i where i = rows
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}
