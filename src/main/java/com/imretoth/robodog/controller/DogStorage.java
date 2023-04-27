package com.imretoth.robodog.controller;

import com.imretoth.robodog.data.BreedType;
import com.imretoth.robodog.data.Dog;

import java.util.List;
import java.util.Optional;

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

    public void addRandomDog() {
        dogList.add( dogCreator.createRandomDog() );
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public String findDogAndUpdateAgeAndBreed(String name, int age, BreedType breedType) {
        Optional<Dog> currentDog = dogList.stream()
                .filter( dog -> dog.getName().equals( name ) )
                .findFirst();

        if(currentDog.isPresent()) {
            currentDog.get().setAge( age );
            currentDog.get().setBreed( breedType );
            return currentDog.toString();
        } else {
            return "Dog doesn't exist";
        }
    }
}
