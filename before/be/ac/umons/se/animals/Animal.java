package be.ac.umons.se.animals;

import java.awt.Color;

public abstract class Animal{
    private Color[] colors;
    public Animal(Color[] colors){
        this.colors = colors;
    }

    public Color[] getColors(){ return this.colors; }

    public abstract void talk();
}
