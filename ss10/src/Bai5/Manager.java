package Bai5;

public class Manager extends Employee implements BonusCalculator {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double getBonus() {
        return getBaseSalary() * 0.2;
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary() + getBonus();
    }
}