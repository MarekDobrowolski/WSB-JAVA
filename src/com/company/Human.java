package com.company;

import devices.Car;
import devices.Phone;

public class Human {
    public Animal animal;
    public Car car;
    public Double cash;
    public Phone phone;
    private Double salary;

    public Human() {
    }



    public Human(Animal animal, Car car, Double cash) {
        this.animal = animal;
        this.car = car;
        this.cash = cash;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("Yeah! you buy a new car by cash!");
            this.car = car;
        } else if (this.salary > (1 / 12.0 * car.value)) {
            System.out.println("Yes, You buy a new car, but on credit");
            this.car = car;
        } else if (this.salary <= car.value) {
            System.out.println("Sorry bro, go to school or something");
        }

        this.car = car;
    }

    @Override
    public String toString() {
        return "Cash: " + this.cash + "Salary: " + this.salary + " Car: " + this.car + " Animal: " + this.animal + " Phone: " + phone;
    }


}
