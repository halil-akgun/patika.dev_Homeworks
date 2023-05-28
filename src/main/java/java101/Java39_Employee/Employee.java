package java101.Java39_Employee;

import java.time.LocalDate;

public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;


    public double tax() {
        return salary < 1000 ? 0 : salary * 0.03;
    }

    public int bonus() {
        return workHours > 40 ? (workHours - 40) * 30 : 0;
    }

    public double raiseSalary() {
        int currentYear = LocalDate.now().getYear();
        if (currentYear - hireYear < 10) return salary * 0.05;
        else if (currentYear - hireYear < 20) return salary * 0.10;
        else return salary * 0.15;
    }

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Name\t\t: " + name + '\n' +
                "Salary\t\t: " + salary + '\n' +
                "Work Hours\t: " + workHours + '\n' +
                "Hire Year\t: " + hireYear + '\n' +
                "Tax\t\t\t: " + tax() + '\n' +
                "Bonus\t\t: " + bonus() + '\n' +
                "Raise Salary: " + raiseSalary() + '\n' +
                "Salary with Tax and Bonus: " + (salary - tax() + bonus()) + '\n' +
                "Total Salary: " + (salary - tax() + bonus() + raiseSalary());
    }
}
