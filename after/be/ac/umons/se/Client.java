package be.ac.umons.se;

import java.awt.Color;
import be.ac.umons.se.animals.*;

public class Client{
    public static void main(String[] args){
        Animal albinosCat = Animal.createAlbinosCat();
        Animal blackCat = Animal.createBlackCat();
        Animal jackRussel = Animal.createJackRussel();

        albinosCat.talk();
        blackCat.talk();
        jackRussel.talk();
    }
}
