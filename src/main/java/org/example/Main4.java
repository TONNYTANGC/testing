package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 2, 3, 3, 4, 4, 5, 5};
        System.out.println("The value is" + removeDuplicates(numbers));
    }

    public static String removeDuplicates(int[] p) {
        Set<Integer> unique = new LinkedHashSet<>(); // preserves order

        for (int value : p) {
            unique.add(value); // Set will automatically skip duplicates
        }

        return unique.toString(); // returns as "[1, 2, 3, 4, 5]"
    }
}
