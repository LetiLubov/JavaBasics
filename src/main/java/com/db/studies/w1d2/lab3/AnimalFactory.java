package com.db.studies.w1d2.lab3;

import com.db.studies.w1d2.lab3.casting.Animal;
import com.db.studies.w1d2.lab3.casting.AnimalCreator;
import com.db.studies.w1d2.lab3.casting.CatCreator;
import com.db.studies.w1d2.lab3.casting.DogCreator;

import java.util.Random;

public class AnimalFactory {


    public static AnimalCreator getRandomAnimal(){
        Random random = new Random();
        if (random.nextInt(2) == 1){
            return new CatCreator();
        }
        return new DogCreator();
    }

}
