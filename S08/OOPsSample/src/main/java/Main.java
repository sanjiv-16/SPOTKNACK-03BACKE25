package main.java;

public class Main {
    public static void main(String[] args) {

        //Encapsulation
//        Student st = new Student("Ivan", 20, "Minsk");
//        System.out.println(st.getName());
//        st.setAge(-9);

        //Inheritance
//        Animal cat = new Cat();
//        cat.voice();

        //Abstraction
//        Appliance app = new Appliance() {
//            @Override
//            public void turnOn() {
//                System.out.println("Appliance is turned on");
//            }
//        };
//
//        app.turnOn();

        Appliance fan = new Fan();
        fan.turnOn();




    }
}