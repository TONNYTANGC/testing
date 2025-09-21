package org.example;

public class Main9 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] reverseChars = reverseString(str);
        System.out.print(reverseChars);
    }

    public static char[] reverseString(String str) {
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1; // 5

        while (left < right) { // 0 < 5
            char temp = chars[left]; // H -> temp
            chars[left] = chars[right]; // E -> H
            chars[right] = temp; // temp -> H = EH
            left ++; // 1
            right --; // 5-1=4
        }
        return chars;
    }
}
