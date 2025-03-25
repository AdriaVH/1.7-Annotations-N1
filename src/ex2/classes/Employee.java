package ex2.classes;

public class Employee {
    private String name;
    private String lastName;
    private int pricePerHour;


    public double calculateSalary (double workedHours) {
        double salary;
        salary = workedHours * pricePerHour;
        return salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Employee(String name, String lastName, int pricePerHour) {
        this.name = name;
        this.lastName = lastName;
        this.pricePerHour = pricePerHour;
    }
}
