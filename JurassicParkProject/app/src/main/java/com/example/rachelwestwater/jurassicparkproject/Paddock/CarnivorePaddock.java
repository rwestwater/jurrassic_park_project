package com.example.rachelwestwater.jurassicparkproject.Paddock;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Velociraptor;

public class CarnivorePaddock extends Paddock {
    public CarnivorePaddock(String name) {
        super(name);
    }

    public void addDinosaur(Velociraptor velociraptor) {
         dinosaurs.add(velociraptor);
    }
}