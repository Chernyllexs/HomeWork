package com.javaoctoberfest.task.Horstmann.chapter_3;

public class Employee implements Measurable{
    private static int count = 0;
    private int id;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.id = count++;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
