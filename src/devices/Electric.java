package devices;

import com.company.Human;

import java.util.ArrayList;

public class Electric extends Car {
    public Electric(String producer, String model, int year, String color, Double value) {
        super(producer, model, year, color, value);
        ownersList = new ArrayList<Human>();
    }

    @Override
    void refuel() {

    }
}
