package com.imretoth.robodog.data;

public class Dog {
    private String name;
    private int age;
    private BreedType breed;

    public Dog(String name, int age, BreedType breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BreedType getBreed() {
        return breed;
    }

    public void setBreed(BreedType breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", breed=" + breed +
                '}';
    }
}
