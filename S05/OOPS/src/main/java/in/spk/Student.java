package main.java.in.spk;

public class Student {

    // Instance variables (fields) represent the state of an object.

    // 'public' access modifier: These can be accessed from any class.
    public String name;
    public int age;

    // 'private' access modifier: This variable is only accessible within this class.
    private String secretInfo = "This is a secret about the student.";

    // =========================================================
    // Constructor 1: A constructor with two parameters.
    // =========================================================
    // This is the primary way to create a 'main.java.in.spk.Student' object.
    public Student(String name, int age) {
        // 'this' keyword refers to the current object.
        this.name = name;
        this.age = age;
        System.out.println("A new Student object was created: " + this.name);
    }

    // =========================================================
    // Constructor 2: An overloaded constructor with one parameter.
    // =========================================================
    public Student(String name) {
        this(name, 0); // Calls the first constructor to avoid code duplication
        System.out.println("A Student object with only a name was created.");
    }


    // =========================================================
    // Methods: Actions an object can perform.
    // =========================================================

    // A simple method with no return value.
    public void study() {
        System.out.println(this.name + " is studying.");
    }

    // Another simple method.
    public void takeExam() {
        System.out.println(this.name + " is taking an exam.");
    }

    // =========================================================
    // Method Overloading example
    // =========================================================

    // Method with no parameters
    public void printInfo() {
        System.out.println("Student: " + this.name + ", Age: " + this.age);
    }

    // Overloaded method with one parameter (different signature)
    public void printInfo(String course) {
        System.out.println("Student: " + this.name + " is enrolled in " + course);
    }

    // =========================================================
    // Method to demonstrate access to a private variable.
    // =========================================================
    public void displaySecretInfo() {
        System.out.println(this.name + " has a secret: " + this.secretInfo);
    }
}