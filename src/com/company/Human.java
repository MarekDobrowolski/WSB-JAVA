package com.company;

public class Human {
    Animal animal;
    Car car;
    private Double salary;

    public Double getSalary() {

        java.util.Date date = new java.util.Date();
        System.out.println("Your salary is: " + this.salary + "Checked at " + date);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Value must be greater than 0");
        }
        else {

            System.out.println(" The new payment has been sent to the accountant");
            System.out.println("The new annex to the contract can be collected from the accountant");
            System.out.println("ZUS and US already know about the new amount");

            this.salary = salary;

        }


    }
}
