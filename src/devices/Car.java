package devices;

import com.company.Human;
import com.company.salleable;

public class Car extends Device implements salleable {


    public Double value;

    String color;

    public Car(String producer, String model, int year, String color, Double value) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.value = value;
    }

    public void turnOn(){
        System.out.println("Engine starts");
    }

    public void sell(Human seller, Human buyer, Double price){
        if (seller.car == this && buyer.cash >= price){
            buyer.cash -= price;
            seller.cash += price;
            seller.car = null;
            buyer.car = this;
            System.out.println(buyer + " buy " + this + " from " + seller + " for " + price);
        }
        else{
            System.out.println("Transaction failed");
        }
    }

}

