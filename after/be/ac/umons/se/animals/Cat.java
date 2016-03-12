package be.ac.umons.se.animals;

import java.awt.Color;

public class Cat extends Animal{
    Cat(Color[] colors){ super(colors); }
    public void talk(){
        System.out.println("Miaou!");
    }
}
