package ex2.classes;

public class RemoteEmployee extends Employee {
    private static final double INTERNET_COST = 20.99;

    public RemoteEmployee(String name, String lastName, int pricePerHour) {
        super(name, lastName, pricePerHour);
    }

    @Override
    public double calculateSalary(double workedHours) {
        return INTERNET_COST + super.calculateSalary(workedHours);
    }
}
