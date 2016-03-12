package be.ac.umons.se;

import java.awt.Color;
import be.ac.umons.se.animals.*;

public class Client{
    public static void main(String[] args){
        Animal albinosCat = new Cat(new Color[]{Color.WHITE});
        Animal blackCat = new Cat(new Color[]{Color.BLACK});
        Animal jackRussel = new Dog(new Color[]{Color.BLACK, Color.WHITE});

        albinosCat.talk();
        blackCat.talk();
        jackRussel.talk();
    }
}
