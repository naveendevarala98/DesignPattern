package org.Liskov.solution;


public class LiskovMain {
    public static void main(String[] args) {
        //if s is subtype of t, then object of T can substitue s
        salary employee = new PermanentEmployee();
        salary employee1 = new TemporaryEmployee();

        System.out.println(employee.getSalary());
        System.out.println(employee1.getSalary());
    }
}
