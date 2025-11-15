package main.java;

public class Manager extends Employee {

    private int managedTeamSize;

    public Manager(int id, String name, double baseSalary, int managedTeamSize) {
        super(id, name, baseSalary);
        this.managedTeamSize = managedTeamSize;
    }

    @Override
    public double calculateBonus() {
        return 500 + (managedTeamSize * 100);
    }

    public void displayInfo() {
        super.displayInfo("Manager");
        System.out.println("Team Size: " + managedTeamSize);
        System.out.println("Monthly Bonus: $" + String.format("%.2f", calculateBonus()));
    }
}
