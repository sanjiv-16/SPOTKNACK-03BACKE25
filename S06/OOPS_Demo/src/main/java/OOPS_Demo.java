package main.java;

import java.util.ArrayList;
import java.util.List;


public class OOPS_Demo {
    public static void main(String[] args) {
        
        System.out.println("======================================================");
        System.out.println("  JAVA OOPs TRAINING DEMO - Employee Management System  ");
        System.out.println("======================================================");

//        System.out.println("\n--- DEMO 1: ENCAPSULATION & ACCESS CONTROL ---");
//
        Employee ceo = new Manager(101, "Alice Johnson", 12000.00, 5);
//
//        System.out.println("Employee Name (Getter): " + ceo.getName());
//
//        ceo.setBaseSalary(12500.00);
//        ceo.setBaseSalary(-500.00);
//        ceo.displayInfo();

//        System.out.println("-----------------------------------------------------");


//        System.out.println("\n--- DEMO 2: INHERITANCE & ABSTRACTION ---");
//
        Developer juniorDev = new Developer(201, "Bob Lee", 4500.00, "Java");
//
//        System.out.println(juniorDev.getName() + " is a Developer.");
//        System.out.println("Annual Salary (Inherited): $" + String.format("%.2f", juniorDev.getAnnualSalary()));
//        System.out.println("Developer Bonus (Abstraction fulfilled): $" + String.format("%.2f", juniorDev.calculateBonus()));
//
//        System.out.println("-----------------------------------------------------");
//
//


//        System.out.println("\n--- DEMO 3: POLYMORPHISM (Runtime & Overriding) ---");
//
//        List<Employee> allEmployees = new ArrayList<>();
//        allEmployees.add(ceo);
//        allEmployees.add(juniorDev);
//        allEmployees.add(new Manager(102, "Charlie Brown", 8000.00, 3));
//        allEmployees.add(new Developer(202, "Dana Scully", 6000.00, "Python"));
//
//        double totalBonus = 0;
//        for (Employee emp : allEmployees) {
//            double bonus = emp.calculateBonus();
//            totalBonus += bonus;
//
//            emp.displayInfo();
//
////            if (emp instanceof Developer) {
////                ((Developer) emp).displayInfo();
////            } else if (emp instanceof Manager) {
////                ((Manager) emp).displayInfo();
////            }
//
//            System.out.println("-----------------------------------");
//        }
//
//        System.out.println("\nTotal monthly bonus payout for the team: $" + String.format("%.2f", totalBonus));

        System.out.println("\n--- DEMO 4: POLYMORPHISM (Method Overloading) ---");
        System.out.println("Calling displayInfo() with one argument:");
        juniorDev.displayInfo("Software Engineer");

        System.out.println("\nCalling displayInfo() with no arguments:");
        ceo.displayInfo();
        
        System.out.println("\n======================================================");
    }
}