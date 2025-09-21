package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

interface Animal {
    Integer getWeight();
    String getName();
}

class Elephant implements Animal {
    @Override
    public Integer getWeight() {
        return 4000;
    }

    @Override
    public String getName() {
        return "Elephant";
    }
}

class Tiger implements Animal {
    @Override
    public Integer getWeight() {
        return 300;
    }

    @Override
    public String getName() {
        return "Tiger";
    }
}

class Bird implements Animal {
    @Override
    public Integer getWeight() {
        return 200;
    }

    @Override
    public String getName() {
        return "Bird";
    }
}

public class Main11{
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Elephant());
        animals.add(new Tiger());
        animals.add(new Bird());

        // ascending
        animals.sort(Comparator.comparingInt(Animal::getWeight));
        for (Animal animal: animals) {
            System.out.println(animal.getName() + " - " + animal.getWeight() + " kg");
        }

        System.out.println();

        // descending
        animals.sort(Comparator.comparingInt(Animal::getWeight).reversed());
        for (Animal animal: animals) {
            System.out.println(animal.getName() + " - " + animal.getWeight() + " kg");
        }
    }
}