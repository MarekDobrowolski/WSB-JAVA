package devices;

import com.company.salleable;


import com.company.Human;

public class Phone extends Device implements salleable {

    public void turnOn() {
        System.out.println("Processor starts");
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            seller.phone = null;
            buyer.phone = this;
            System.out.println(buyer + " buy " + this + " from " + seller + " for " + price);
        } else {
            System.out.println("Transaction failed");
        }
    }

}
