package be.ac.umons.se.animals;

import java.awt.Color;

public abstract class Animal{
    private Color[] colors;
    Animal(Color[] colors){
        this.colors = colors;
    }

    public Color[] getColors(){ return this.colors; }

    public abstract void talk();

    public static Animal createAlbinosCat(){
        return new Cat(new Color[]{Color.WHITE});
    }

    public static Animal createBlackCat(){
        return new Cat(new Color[]{Color.BLACK});
    }

    public static Animal createJackRussel(){
        return new Dog(new Color[]{Color.BLACK, Color.WHITE});
    }
}
