package org.example;

public class Test2 {
    static {
        try {
            throw new Exception();
        } catch (Exception ex) {
            System.out.println(1);
        }
        finally {
            System.out.println(2);
        }
    }

    public static void main (String [] args) {
        Test2 jq = new Test2();
    }
}
