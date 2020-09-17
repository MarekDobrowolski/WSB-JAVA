package devices;

public abstract class Device {

    String producer;
    String model;
    public int year;
    Double value;

    @Override
    public String toString() {

        return "Producer: " + this.producer + ", model: " + this.model + ", year: " + this.year + ", color: ";
    }

    public abstract void turnOn();




}
