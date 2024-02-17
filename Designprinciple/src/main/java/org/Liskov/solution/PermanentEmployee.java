package org.Liskov.solution;

public class PermanentEmployee implements sEmployee {

    @Override
    public int bonus() {
        return 0;
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
