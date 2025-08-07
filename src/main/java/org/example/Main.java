package org.example;

// Encapsulation
class Person {
    private String name;  // private = encapsulated
    private int age;

    public Person(String name, int age) {  // constructor
        this.name = name;
        this.age = age;
    }

    // Public getters and setters (controlled access)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}

class x {
    void method(int a) {
        System.out.println("ONE");
    }
    void method(double d) {
        System.out.println("TWO");
    }
    // inheritance
    void method2(String s) {
        System.out.println("FOUR");
    }
}
    // polymorphism
class y extends x {
    @Override
    void method(double d) {
        System.out.println("THREE");
    }
}

public class Main {
    public static void main(String[] args) {
        new y ().method(100.00);
        new x ().method2("Hello");
    }
}
