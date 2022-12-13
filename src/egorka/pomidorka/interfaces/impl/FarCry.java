package egorka.pomidorka.interfaces.impl;

import egorka.pomidorka.interfaces.Playable;

public class FarCry implements Playable {
    @Override
    public void play() {
        System.out.println("Ты знаешь, что такое безумие?");
    }
}
