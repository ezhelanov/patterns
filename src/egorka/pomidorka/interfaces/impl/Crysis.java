package egorka.pomidorka.interfaces.impl;

import egorka.pomidorka.interfaces.Playable;

public class Crysis implements Playable {
    @Override
    public void play() {
        System.out.println("Я - Пророк");
    }
}
