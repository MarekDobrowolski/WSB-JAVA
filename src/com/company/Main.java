package com.company;

import creatures.Animal;
import creatures.Pet;
import devices.Car;
import devices.Disel;
import devices.LPG;
import devices.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Zadanie 1

        Animal animial = new Pet("cat");
        animial.feed();

        for (int i = 0; i < 12; i++) {
            animial.takeForAWalk();
        }

        animial.feed();

        // Zadanie 2
        Car car = new Disel("BMW", "e36", 1989, "red", 4000.0);
        Human human1 = new Human();
        //human1.car = car;

        // Zadanie 5
//        System.out.println("----");
//        human1.setSalary(5000.0);
//        human1.setCar(car);
//
//        System.out.println("----");
//        human1.setSalary(1000.0);
//        human1.setCar(car);
//
//        System.out.println("----");
//        human1.setSalary(1.0);
//        human1.setCar(car);

        // Zadanie 6
        //6.2
        Car car2 = new LPG("Audi", "a4", 1999, "blue", 4000.0);

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
//        System.out.println(car.toString());
//        System.out.println(animial.toString());
//        System.out.println(human1.toString());

        // Zadanie 7
        car.turnOn();
        Phone phone = new Phone();
        phone.turnOn();


        // Zadanie 8
//        Animal animalForSell = new Pet("Dog");
//        Human seller = new Human(animalForSell, null, 2000.0);
//        Human buyer = new Human(null, null, 2000.0);
//
//        // kiedy kupujący ma za mało gotówki
//        animalForSell.sell(seller, buyer, 3000.0);
//
//        // kiedy sprzedający nie posiada zwierzaka na sprzedaż
//        animalForSell.sell(buyer, seller, 1000.0);
//
//        System.out.println("#######");
//
//        // Stan przed transakcją:
//        System.out.println("Seller: " + seller);
//        System.out.println("Buyer: " + buyer);
//
//        // kiedy wszytkie warunki spelnione
//        animalForSell.sell(seller, buyer, 1000.0);
//
//        // Stan po transakcj1:
//        System.out.println("Seller: " + seller);
//        System.out.println("Buyer: " + buyer);
//
//        // phone
//        System.out.println("\n\nPhone:");
//        seller.phone = phone;
//
//        // Stan przed transakcją:
//        System.out.println("Seller: " + seller);
//        System.out.println("Buyer: " + buyer);
//
//        phone.sell(seller, buyer, 500.0);
//
//        // Stan po transakcj1:
//        System.out.println("Seller: " + seller);
//        System.out.println("Buyer: " + buyer);
//
//        // car
//        System.out.println("\n\nCar:");
//        seller.car = car;
//
//        // Stan przed transakcją:
//        System.out.println("Seller: " + seller);
//        System.out.println("Buyer: " + buyer);
//
//        car.sell(seller, buyer, 300.0);
//
//        // Stan po transakcj1:
//        System.out.println("Seller: " + seller);
//        System.out.println("Buyer: " + buyer);

        // Zadanie 9

        Pet pet = new Pet("mouse");
        System.out.println(pet);
        pet.feed(23.0);
        System.out.println(pet);

        // Zadanie 10

        Phone androidPhone = new Phone();
        androidPhone.installAnnApp("Tinder");
        androidPhone.installAnnApp("Tinder", "v1.1.2");
        androidPhone.installAnnApp("Tinder", "v1.1.2", "googleplay.com/tinderv1.12.2");
        List<String> applist = Arrays.asList("Tinder", "Badoo", "Facebook", "Gmail");
        androidPhone.installAnnApp(applist);

        // Zadanie 11

        Human human2  = new Human(5000.0, 6, 20000.0);
        Human human3  = new Human(5000.0, 6, 20000.0);
        human2.setCar(car, 2);
        human2.setCar(car2, 3);
        human2.setCar(new LPG("Fiat", "Uno", 2000, "blue", 800.0), 1);
        human2.setCar(new LPG("Opel", "Corsa", 2005, "blue", 400.0), 4);

        System.out.println("\n\nSort():");
        System.out.println(Arrays.asList(human2.garage));
        human2.sortCarsByDate();
        System.out.println(Arrays.asList(human2.garage));

        System.out.println("\n\nSell():");
        // Stan przed transakcją:
        System.out.println("Seller: " + human2);
        System.out.println("Buyer: " + human3);

        car2.sell(human2, human3, 2000.0);

        // Stan po transakcj1:
        System.out.println("Seller: " + human2);
        System.out.println("Buyer: " + human3);


        // Zadanie 12
        Human newHuman  = new Human(5000.0, 6, 20000.0);

        System.out.println("\n\n\n");
        System.out.println(car2.ownersList);

        System.out.println(car2.wasOwner(human2));
        System.out.println(car2.wasOwner(newHuman));

        System.out.println(car2.ifHaveSold(human2, human3));
        System.out.println(car2.ifHaveSold(human3, human2));

        System.out.println(car2.getNumberOfTransaction());


    }
}
