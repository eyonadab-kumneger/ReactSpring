package com.springreact.react.Entity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springreact.react.Repository.ReactRepository;

@Component
public class ReactLoader implements CommandLineRunner {

    private final ReactRepository reactRepository;


    public ReactLoader(ReactRepository reactRepository) {
        this.reactRepository = reactRepository;
    }



    @Override
    public void run(String... args) throws Exception {
        
        System.out.println("Hellloooooo");
        //this.reactRepository.save(new ReactEntity("Eyonadab Kumneger", "eyu@react.spring"));
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
    }



    
}
