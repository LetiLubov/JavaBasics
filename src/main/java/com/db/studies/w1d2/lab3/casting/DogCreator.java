package com.db.studies.w1d2.lab3.casting;

public class DogCreator implements AnimalCreator {

    @Override
    public Animal create() {
        return new Dog();
    }
}
