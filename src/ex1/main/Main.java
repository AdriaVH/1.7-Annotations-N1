package ex1.main;

import ex1.classes.*;

public class Main {
    public static void main(String[] args) {

        RemoteEmployee remoteEmployee = new RemoteEmployee("Adria", "Vargas", 18);
        Employee employee1 = new Employee("Adria", "Vargas", 18);
        OfficeEmployee office1 = new OfficeEmployee("Adria", "Vargas", 18);

        System.out.println(employee1.calculateSalary(140));
        System.out.println(remoteEmployee.calculateSalary(140));
        System.out.println(office1.calculateSalary(140));

    }
}