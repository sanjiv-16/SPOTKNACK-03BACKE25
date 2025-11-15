package main.java.in.spk;

public class Student {

    public String name;
    protected int age;
    private String secretInfo = "This is a secret about the student.";
    public static String collegeName = "ABC College";

    public Student(String name, int age) {
        // 'this' keyword refers to the current object.
        this.name = name;
        this.age = age;
        System.out.println("A new Student object was created: " + this.name);
    }
    public Student() {
        System.out.println("A new Student object was created.");
    }

    public Student(String name) {
        this(name, 0); // Calls the first constructor to avoid code duplication
        System.out.println("A Student object with only a name was created.");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public void study() {
        System.out.println(name + " is studying.");
    }
    public void takeExam() {
        System.out.println(this.name + " is taking an exam.");
    }

    public void printInfo() {
        System.out.println("Student: " + this.name + ", Age: " + this.age);
    }

    public void printInfo(String course) {
        System.out.println("Student: " + this.name + " is enrolled in " + course);
    }

    public void displaySecretInfo() {
        System.out.println(this.name + " has a secret: " + this.secretInfo);
    }
}

class Employee extends Student {

    public Employee(String name, int age) {
        super(name, age);
    }
    @Override
    public void printInfo(String course) {
        System.out.println("Employee: " + this.name + " is enrolled in " + course);
    }
}
