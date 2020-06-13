package com.company;

public class Animal extends Human
{

     public String species;
    private Double weight;


    public Animal()
    {
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
        this.weight += 1;
        System.out.println("Weight of animal is: " +weight);

        if (this.weight == 0){
            System.out.println("Sorry dude. Animal is dead!");
        }
        else if (this.weight < 0){
            System.out.println("You cannot feed dead animal!!!");
        }
    }

    public void TakeForAWalk(){
        this.weight -= 1;
        System.out.println("Weight of animal is: " +weight);

        if (this.weight == 0){
            System.out.println("Sorry dude. Animal is dead!");
        }
        else if (this.weight < 0){
            System.out.println("Walk with dead animal?! I'm think the people will not be happy with this!");
        }

    }

}
