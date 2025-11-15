package main.java;

public abstract class Employee {

    private int id;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateBonus();

    public double getAnnualSalary() {
        return baseSalary * 12;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double newSalary) {
        if (newSalary > 0) {
            this.baseSalary = newSalary;
            System.out.println(name + "'s salary updated successfully.");
        } else {
            System.out.println("Error: Salary must be positive.");
        }
    }

    public void displayInfo() {
        System.out.println("--- Employee Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + String.format("%.2f", baseSalary));
    }

    public void displayInfo(String role) {
        System.out.println("Role: " + role);
    }
}
