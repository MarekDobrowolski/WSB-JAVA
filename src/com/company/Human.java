package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Human {
    public Animal animal;
    public Car[] garage;
    public Double cash;
    public Phone phone;
    private Double salary;
    final int defaultGarageSize = 4;

    public Human() {
    }



    public Human(Animal animal, Double cash) {
        this.animal = animal;
        this.garage = new Car[defaultGarageSize];
        this.cash = cash;
    }

    public Human(Double cash, int garageSize, Double salary) {
        this.cash = cash;
        this.garage = new Car[garageSize];
        this.salary = salary;
    }

    public Double getSalary() {

        java.util.Date date = new java.util.Date();
        System.out.println("Your salary is: " + this.salary + "Checked at " + date);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Value must be greater than 0");
        } else {

            System.out.println(" The new payment has been sent to the accountant");
            System.out.println("The new annex to the contract can be collected from the accountant");
            System.out.println("ZUS and US already know about the new amount");

            this.salary = salary;

        }


    }

    public Car getCar(int position) {
        return garage[position];
    }

    public void setCar(Car car, int position) {
        if (this.salary > car.value) {
            System.out.println("Yeah! you buy a new car by cash!");
            this.garage[position] = car;
            car.ownersList.add(this);
        } else if (this.salary > (1 / 12.0 * car.value)) {
            System.out.println("Yes, You buy a new car, but on credit");
            this.garage[position] = car;
            car.ownersList.add(this);
        } else if (this.salary <= car.value) {
            System.out.println("Sorry bro, go to school or something");
        }
    }

    public double getSumOfCarValue(){
        double sum = 0;
        for (Car car : this.garage) {
            sum += car.value;
        }
        return sum;
    }

    public void sortCarsByDate(){

        Arrays.sort(this.garage, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                if (o1 == null) return 1;
                if (o2 == null) return -1;
                if (o1.year > o2.year) return 1;
                else if (o1.year < o2.year) return -1;
                else return 0;
            }
        });
    }

    @Override
    public String toString() {
        return "Cash: " + this.cash + "Salary: " + this.salary + " Cars: " + Arrays.asList(garage) + " Animal: " + this.animal + " Phone: " + phone;
    }


}
