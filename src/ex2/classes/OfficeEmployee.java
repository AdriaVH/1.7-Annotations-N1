package ex2.classes;

public class OfficeEmployee extends Employee {
    private static double petrol = 41.50;

    @Override
    public double calculateSalary(double workedHours) {
        return petrol + super.calculateSalary(workedHours);
    }

    public OfficeEmployee(String name, String lastName, int pricePerHour) {
        super(name, lastName, pricePerHour);


    }

    /**
     * @param daysOfHoliday
     * Not in use anymore
     */
    @Deprecated
    public void giveHolidays(int daysOfHoliday){
        System.out.println("You have " + daysOfHoliday + " Holiday days.");
    }
}
