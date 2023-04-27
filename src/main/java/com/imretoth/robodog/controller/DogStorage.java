package com.imretoth.robodog.controller;

import com.imretoth.robodog.data.BreedType;
import com.imretoth.robodog.data.Dog;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DogStorage {
    private List<Dog> dogList;
    private DogCreator dogCreator;

    public DogStorage(List<Dog> dogList, DogCreator dogCreator) {
        this.dogList = dogList;
        this.dogCreator = dogCreator;
    }

    public void addDog(Dog dog) {
        dogList.add( dog );
    }

    public Dog addRandomDog() {
        Dog randomDog = dogCreator.createRandomDog();
        dogList.add( randomDog);
        return randomDog;
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public List<Dog> findDogAndUpdateAgeAndBreed(Dog newDog, String name) {
        Optional<Dog> currentDog = dogList.stream()
                .filter( dog -> dog.getName().equals( name ) )
                .findFirst();

        if(currentDog.isPresent()) {
            currentDog.get().setAge( newDog.getAge() );
            currentDog.get().setBreed( newDog.getBreed() );
            return dogList;
        } else {
            return null;
        }
    }
}
