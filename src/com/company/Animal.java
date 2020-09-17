package com.company;

public class Animal {
    final String species;
    private double weight;

    public Animal(String species) {
        this.species = species;

        if (species == "dog") {
            this.weight = 10.0;
        } else if (species == "cat") {
            this.weight = 7.0;
        } else if (species == "cow") {
            this.weight = 50.0;
        } else {
            this.weight = 13.0;
        }
    }

    public void feed() {


        if (this.weight > 0) {
            this.weight += 1;
            System.out.println("Weight of animal is: " + this.weight);
        }
        if (this.weight <= 0)
            System.out.println("Sorry, Your animal is dead!");


    }

    public void takeForAWalk() {

        if (this.weight > 0) {
            this.weight -= 1;
            System.out.println("Weight of animal is: " + this.weight);
        }
        if (this.weight <= 0)
            System.out.println("Sorry, Your animal is dead! Don't walk with dead animal");


    }

    @Override
    public String toString() {
        return " Species: " + this.species + ", Weight: " + this.weight;
    }
}
