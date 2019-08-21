package com.db.studies.w1d2.lab3;

import com.db.studies.w1d2.lab3.casting.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory::getRandomAnimal;
        animal.makeVoice();
    }
}
