package org.Liskov.violation;

public class LiskovMain {
    public static void main(String[] args) {
        Employee employee = new PermanentEmployee();
        System.out.println(employee.getMinimumSalary());
    }
}
