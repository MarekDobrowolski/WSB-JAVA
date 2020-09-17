package devices;

public class Car extends Device {


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

}

