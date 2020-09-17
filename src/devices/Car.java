package devices;

import com.company.Human;
import com.company.salleable;

import java.util.Arrays;

public abstract class Car extends Device implements salleable {


    public Double value;

    String color;

    public Car(String producer, String model, int year, String color, Double value) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.value = value;
    }

    public void turnOn() {
        System.out.println("Engine starts");
    }

    public void sell(Human seller, Human buyer, Double price) {
        int numberOfCarsInBuyerGarage = 0;
        for (int i = 0; i < buyer.garage.length; i++) {
            if (buyer.garage[i] != null)
                numberOfCarsInBuyerGarage++;
        }

        if (!Arrays.asList(seller.garage).contains(this))
            System.out.println("Seller doesn't have this car!");
        else if (buyer.garage.length <= numberOfCarsInBuyerGarage)
            System.out.println("Buyer has no free place in his garage");
        else if (buyer.cash < price)
            System.out.println("Buyer has no enough money");
        else {
            seller.garage[Arrays.asList(seller.garage).indexOf(this)] = null;

            for (int i = 0; i < buyer.garage.length; i++) {
                if (buyer.garage[i] == null) {
                    buyer.garage[i] = this;
                    break;
                }
            }
            buyer.cash -= price;
            seller.cash += price;

            System.out.println("Transaction successful");
        }


    }

    abstract void refuel();

}

