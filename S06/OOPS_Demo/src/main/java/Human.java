package main.java;

public interface Human {
    void walk();
    void run();
    default void sleep() { System.out.println("Sleeping..."); }
}
