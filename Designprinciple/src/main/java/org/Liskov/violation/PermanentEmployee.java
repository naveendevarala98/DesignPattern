package org.Liskov.violation;

public class PermanentEmployee implements Employee{
    @Override
    public int getMinimumSalary() {
        return 2;
    }

    @Override
    public int getBonus() {
        return 3;
    }
}
