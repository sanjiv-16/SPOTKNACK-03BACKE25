package main.java;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(int id, String name, double baseSalary, String programmingLanguage) {
        super(id, name, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    public double calculateBonus() {
        return getBaseSalary() * 0.10;
    }



    public void displayInfo() {
        super.displayInfo("Developer");
        super.displayInfo();
        System.out.println("Language: " + programmingLanguage);
        System.out.println("Monthly Bonus: $" + String.format("%.2f", calculateBonus()));
    }
}
