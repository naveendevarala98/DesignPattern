package org.Liskov.violation;

public class TemporaryEmployee implements Employee{

    @Override
    public int getMinimumSalary() {
        return 0;
    }

    @Override
    public int getBonus() {
        //this violates the liskov sub principle, because of throwing
        throw new RuntimeException("bonus not applicable for contrat employee");
    }
}
