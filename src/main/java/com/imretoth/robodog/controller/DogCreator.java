package com.imretoth.robodog.controller;

import com.github.javafaker.Faker;
import com.imretoth.robodog.data.BreedType;
import com.imretoth.robodog.data.Dog;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DogCreator {
    private Faker faker;

    @Value("${app.minAge}")
    private int minAge;

    @Value("${app.maxAge}")
    private int maxAge;

    public DogCreator(Faker faker) {
        this.faker = faker;
    }

    public Dog createRandomDog() {
        String name = faker.dog().name();
        int age = faker.number().numberBetween( minAge, maxAge );
        BreedType breed = faker.options().option( BreedType.class );
        return new Dog( name, age, breed );
    }
}
