package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortByPermutationCount {

    // Helper: calculate factorial
    private static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Helper: count unique permutations of digits in a number
    private static long countPermutations(int num) {
        String s = String.valueOf(num);
        Map<Character, Integer> freq = new HashMap<>();

        // count each digit frequency
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1); // check the character is already in the map or not, if yes return the value, if not return 0 and add 1 to the value
        }

        long numerator = factorial(s.length());
        long denominator = 1;

        for (int count : freq.values()) {
            denominator *= factorial(count);
        }

        return numerator / denominator;
    }

    public static void main(String[] args) {
        Integer[] arr = {5566, 5678, 1131, 7724, 8888};

        Arrays.sort(arr, (a, b) -> {
            long permA = countPermutations(a);
            long permB = countPermutations(b);
            return Long.compare(permA, permB); // ascending order
        });

        for (int num : arr) {
            System.out.println(num + " has " + countPermutations(num) + " permutations");
        }
    }
}
