package org.example;

// Create Student class with: name, Map<String, Integer> grades (subject → score).
//
//Store students in a LinkedList.
//
//Implement:
//
//Add student.
//
//Update grades.
//
//Find student with highest average score.

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

class Student {
    private String name;
    private final Map<String, Double> grades;

    // Constructor
    public Student (String name) {
        this.name = name;
        this.grades = new HashMap<>();
    }

    //getter
    public String getName() {
        return name;
    }
    public Map<String, Double> getGrades() {
        return grades;
    }

    // setter
    public void setName() {
        this.name = name;
    }
    public void addGrade(String subject, double score) {
        grades.put(subject, score);
    }
}

class School {
    private LinkedList<Student> students = new LinkedList<>();

    // add student
    public void addStudent (Student student) {
        students.add(student);
    }

    // update grades
    public void updateStudents(String name, String subject, double grades) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.addGrade(subject, grades);
                return;
            }
        }
        System.out.println("Student not found: " + name);
    }

    // get student
    public LinkedList<Student> getStudents() {
        return students;
    }
}

public class Main16 {
    public static void main(String[]args) {
        School schools = new School();

        schools.addStudent(new Student("John"));
        schools.updateStudents("John", "Science", 30);

        schools.addStudent(new Student("Marry"));
        schools.updateStudents("Marry", "Science", 70);
        schools.updateStudents("Marry", "Science", 100);

        for (Student s : schools.getStudents()) {
            System.out.println(s.getName() + "'s grades:" + s.getGrades());
        }
    }
}
