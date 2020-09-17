package devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;

public class LPG extends Car {
    public LPG(String producer, String model, int year, String color, Double value) {
        super(producer, model, year, color, value);
        ownersList = new ArrayList<Human>();
    }

    @Override
    void refuel() {

    }
}
