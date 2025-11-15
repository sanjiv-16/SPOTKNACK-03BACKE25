package main.java.in.spk;

public class OOPS_Session1 {

    /**
     * Core OOP Concepts & Access Modifiers
     * * Pillars of OOP:
     * 1. Encapsulation: Bundles data (variables) and methods that operate on the data into a single unit (class). It hides the internal state of an object from the outside.
     * 2. Inheritance: Allows a new class (subclass) to inherit fields and methods from an existing class (superclass), promoting code reusability.
     * 3. Polymorphism: The ability of an object to take on many forms. It allows a single method name to be used for different behaviors.
     * 4. Abstraction: Hides complex implementation details and shows only the necessary features of an object. Achieved using abstract classes and interfaces.
     *
     * Access Modifiers:
     * - public: Accessible from any other class.
     * - protected: Accessible within the same package and by subclasses.
     * - default (no keyword): Accessible only within the same package.
     * - private: Accessible only within the same class.
     */

    // The main method is the entry point of the program.
    public static void main(String[] args) {

        // =========================================================
        // 1. Defining Classes and Creating Objects
        // =========================================================
        // A class is a blueprint, and an object is an instance of that blueprint.
        // Here, we create two objects (instances) of the 'main.java.in.spk.Student' class.

//        System.out.println("--- 1. Classes & Objects ---");
//        Student student1 = new Student("Alice", 20); // Creates an object using the constructor
//        Student student2 = new Student("Bob", 22);
//
//        Student s3 = new Student("Charli");
//        s3.setName("Charlie");
//
//        // We can access the object's properties (instance variables)
//        System.out.println(student1.name + " is " + student1.age + " years old.");
//        System.out.println(student2.name + " is " + student2.age + " years old.");
//        System.out.println(); // for a new line

//        // =========================================================
//        // 2. Constructors
//        // =========================================================
//        // Constructors are special methods used to initialize objects.
//        // We can have multiple constructors (constructor overloading).
//        System.out.println("--- 2. Constructors ---");
//        Student student3 = new Student("Charlie"); // Uses the constructor with one parameter
//        System.out.println("Student 3's name is " + student3.name);
//        System.out.println();

        // =========================================================
        // 3. Defining Methods
        // =========================================================
        // A method is a block of code that performs a specific task.
        // We call methods using the object.
//        System.out.println("--- 3. Methods ---");
//        student1.study(); // Calls the 'study' method on student1
//        student2.takeExam(); // Calls the 'takeExam' method on student2
//        System.out.println();
//
//        System.out.println("college  name of s1 :" + student1.collegeName);
//        student1.collegeName = "IIT";
//        System.out.println("college  name of s1 :" + student2.collegeName);
//
//        // =========================================================
//        // 4. Method Overloading
//        // =========================================================
//        // Method overloading allows a class to have multiple methods with the same name
//        // but different parameters.
//        System.out.println("--- 4. Method Overloading ---");
//        student1.printInfo(); // Calls the method with no parameters
//        student1.printInfo("Computer Science"); // Calls the overloaded method with a String parameter
//        System.out.println();
//
        // =========================================================
        // 5. Access Modifiers
        // =========================================================
        // Access modifiers control the visibility of classes, methods, and variables.
        // 'public' is accessible from anywhere.
        // 'private' is only accessible within the class.
//        System.out.println("--- 5. Access Modifiers ---");
//        // student1.secretInfo; // This would cause a compile error because 'secretInfo' is private.
//        // The only way to access it is through a public method.
//        student1.displaySecretInfo();

        Student emp1 = new Employee("John", 30);
        emp1.printInfo("Computer Science");
    }
}
