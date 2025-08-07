package org.example;

public class Main8 {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to count words";
        int count = countWords(sentence);
        System.out.println("Number of words in the sentence: " + count);
    }

    public static int countWords(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }
}
