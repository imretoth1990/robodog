package com.imretoth.robodog.controller;

import com.imretoth.robodog.data.BreedType;

import java.util.List;
import java.util.Random;

public class ProvideRandomProperties {
    Random random;
    List<String> names;
    List<BreedType> breeds;
    int maxAge;

    public ProvideRandomProperties(Random random, List<String> names, List<BreedType> breeds, int maxAge) {
        this.random = random;
        this.names = names;
        this.breeds = breeds;
        this.maxAge = maxAge;
    }

    public String getRandomName() {
        int index = random.nextInt( names.size() );
        return names.get( index );
    }

    public int getRandomAge() {
        return random.nextInt( maxAge );
    }

    public BreedType getRandomBreed() {
        int index = random.nextInt( breeds.size() );
        return breeds.get( index );
    }
}
