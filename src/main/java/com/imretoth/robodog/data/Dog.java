package com.imretoth.robodog.data;

public class Dog {
    private int age;
    private String name;
    private BreedType breed;

    public Dog(int age, String name, BreedType breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public BreedType getBreed() {
        return breed;
    }
}
