package com.imretoth.robodog.runner;

import com.imretoth.robodog.controller.DogCreator;
import com.imretoth.robodog.data.Dog;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/*
public class RoboDogApp implements ApplicationRunner {
    DogCreator dogCreator;

    public RoboDogApp(DogCreator dogCreator) {
        this.dogCreator = dogCreator;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Dog> dogList = IntStream.rangeClosed( 1, 100 )
                .mapToObj( e -> dogCreator.createRandomDog() )
                .collect( Collectors.toList() );

        for (Dog dog : dogList) {
            System.out.println( dog.toString() );
        }
    }


}
 */

