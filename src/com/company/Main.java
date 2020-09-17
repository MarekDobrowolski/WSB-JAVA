package com.company;

import devices.Car;

public class Main {
    public static void main(String[] args) {

        // Zadanie 1

        Animal animial = new Animal("cat");
        animial.feed();

        for (int i = 0; i < 12; i++) {
            animial.takeForAWalk();
        }

        animial.feed();

        // Zadanie 2
        Car car = new Car("BMW", "e36", 1989, "red", 4000.0);
        Human human1 = new Human();
        //human1.car = car;

        // Zadanie 5
        System.out.println("----");
        human1.setSalary(5000.0);
        human1.setCar(car);

        System.out.println("----");
        human1.setSalary(1000.0);
        human1.setCar(car);

        System.out.println("----");
        human1.setSalary(1.0);
        human1.setCar(car);

        // Zadanie 6
        //6.2
        Car car2 = new Car("BMW", "e36", 1989, "red", 4000.0);

        System.out.println("Porównianie przez equals() bez nadpisania:");
        System.out.println(car.equals(car2));

        System.out.println("Porównianie przez hashcode():");
        System.out.println(car.hashCode() == car2.hashCode());
        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());


        // 6.3
        System.out.println(car);
        System.out.println(car2);


        // 6.5
        System.out.println(car.toString());
        System.out.println(animial.toString());
        System.out.println(human1.toString());
    }
}
