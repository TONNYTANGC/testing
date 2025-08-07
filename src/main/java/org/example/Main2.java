package org.example;

public class Main2 {
    public static void main(String[] args) {
        int num[] = {5, 34, 23, 12, 6, 78, 43, 89, 23, 10};
        printTwoBiggestNumbers(num);
    }

    public static void printTwoBiggestNumbers(int[] num) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max1) {
                max2 = max1;
                max1 = num[i];
            } else if (num[i] > max2 && num[i] != max1) {
                max2 = num[i];
            }
        }
        System.out.println("The two biggest numbers are: " + max1 + " and " + max2);
    }
}

