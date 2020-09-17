package creatures;

import creatures.Animal;
import creatures.Edbile;

public class FarmAnimal extends Animal implements Edbile {
    public FarmAnimal(String species) {
        super(species);
    }
    public void beEaten(){
        System.out.println("Whay R U not wegan?");
    };
}
