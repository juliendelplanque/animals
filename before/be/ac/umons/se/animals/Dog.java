package be.ac.umons.se.animals;

import java.awt.Color;

public class Dog extends Animal{
    public Dog(Color[] colors){ super(colors); }
    public void talk(){
        System.out.println("Wouf!");
    }
}
