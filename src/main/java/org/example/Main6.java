package org.example;

public class Main6 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        String reversedStr = reverseString(str);
        System.out.println(reversedStr);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
