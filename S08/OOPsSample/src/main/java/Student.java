package main.java;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        if(Objects.isNull(name) && name.isEmpty()) {
            throw new RuntimeException("Name can't be empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new RuntimeException("Age can't be negative");
        }
        this.age = age;
    }

    public void setAge(String age){
        this.age = 18;
    }
}
