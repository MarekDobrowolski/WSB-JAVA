package com.company;

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
        Car car = new Car( "BMW","e36", 1989,"red",4000.0);
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


    }
}
