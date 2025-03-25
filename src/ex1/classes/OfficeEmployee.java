package ex1.classes;

public class OfficeEmployee extends Employee{
    private static double petrol = 41.50;

    @Override
    public double calculateSalary(double workedHours) {
        return petrol + super.calculateSalary(workedHours);
    }

    public OfficeEmployee(String name, String lastName, int pricePerHour) {
        super(name, lastName, pricePerHour);


    }
}
