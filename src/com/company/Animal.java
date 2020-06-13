package com.company;

public class Animal extends Human
{

     public final String species;
    private Double weight;


    Animal(String species)
    {
        this.species = species;
        if (species == "dog"){
            this.weight = 8.0;
        }
        else if (species == "cat"){
            this.weight = 5.0;
        }
        else   if (species == "horse"){
            this.weight = 90.0;
        }


    }

    public void Feed(){
        this.weight++;
        System.out.println("Weight of animal is: " +weight);

        if (this.weight == 0){
            System.out.println("Sorry dude. Animal is dead!");
        }
        else if (this.weight < 0){
            System.out.println("You cannot feed dead animal!!!");
        }
    }

    public void TakeForAWalk(){
        if (this.weight > 0) {
            this.weight--;
            System.out.println("Weight of animal is: " + weight);
        }
        if (this.weight == 0){
            System.out.println("Sorry dude. Animal is dead!");
        }
        else if (this.weight < 0){
            System.out.println("Walk with dead animal?! I'm think the people will not be happy with this!");
        }

    }

}
