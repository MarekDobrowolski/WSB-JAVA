package devices;

public abstract class Device {

    String producer;
    String model;
    int year;

    @Override
    public String toString() {

        return "Producer: " + this.producer + ", model: " + this.model + ", year: " + this.year + ", color: ";
    }

    public abstract void turnOn();




}
