package com.java.october.fest.task.Horstmann.chapter_3;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", 55263.45);
        Employee employee2 = new Employee("Kolya", 88792.7);
        Employee employee3 = new Employee("Ekaterina", 25978.9);
        Employee employee4 = new Employee("Anna", 100123.68);
        Employee employee5 = new Employee("Pasha", 152666.777);


        System.out.println("Average salary: " + Measurable.average(new Measurable[]{employee1, employee2, employee3, employee4, employee5}));

        Employee employee = (Employee) Measurable.largest(new Measurable[]{employee1, employee2, employee3, employee4, employee5});
        System.out.println("Largest salary: " + employee.getName() + " with the value " + employee.getSalary());
    }
}
