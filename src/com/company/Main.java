package com.company;

public class Main {
    public static void main(String[] args) {

        Animal animial = new Animal("cat");
        animial.feed();

        for (int i = 0; i < 12; i++) {
            animial.takeForAWalk();
        }

        animial.feed();
    }
}
