package com.company;

import org.w3c.dom.ls.LSOutput;

public class Human extends Car
{
    String lastname;
    String firstname;
    String animalPet;
    private Car car;
    private Double salary;


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("Salary cannot be lower than 0! ");

        }
        else {
            System.out.println("A new payment has been sent to the accounting department");
            System.out.println("You must pick up the annex to the contract from Ms. Hania");
            System.out.println("ZUS and US already know about your salary");
            this.salary = newSalary;
            System.out.println("Your new salary is: " +newSalary);
        }

    }

    public Car getCar() {
        return car;
    }

    public Car setCar() {

        if (salary > car.value){
            System.out.println("You buy a new car for the cash ");
            return car;

        }

        else if(salary > 1.0/12 * car.value){
            System.out.println("You buy a new car, but on credit ");
            return car;
        }
        else{
            System.out.println("You are poor. Find a new job or something");
        }
        return car;
    }

}
