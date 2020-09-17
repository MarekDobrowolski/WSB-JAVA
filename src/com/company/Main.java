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
        Car car = new Car( "BMW","e36", 1989,"red");
        Human human1 = new Human();
        human1.car = car;



    }
}
