package egorka.pomidorka.interfaces.impl;

import egorka.pomidorka.interfaces.Playable;

public class DoomEternal implements Playable {
    @Override
    public void play() {
        System.out.println("Круши, ломай!");
    }
}
