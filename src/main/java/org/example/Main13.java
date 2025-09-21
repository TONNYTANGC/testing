package org.example;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    String id;
    String name;
    double salary;

    //Constructor
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //Getter and Setter methods
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //toString method
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    //compareTo method
    @Override
    public int compareTo(Employee e) {
        if (this.salary > e.salary) {
            return -1;
        } else if (this.salary < e.salary) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class Main13 {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(new Employee("1", "John", 50000));
        employees.add(new Employee("2", "Jane", 60000));
        employees.add(new Employee("3", "Bob", 55000));
        employees.add(new Employee("4", "Alice", 55000));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
