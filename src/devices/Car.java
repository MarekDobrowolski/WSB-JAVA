package devices;

public class Car {
    final String producer;
    final String model;
    public Double value;
    int year;
    String color;

    public Car(String producer, String model, int year, String color, Double value) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {

        return "Producer: " + this.producer + ", model: " + this.model + ", year: " + this.year + ", color: " + this.color + ", value: " + this.value;
    }
}

