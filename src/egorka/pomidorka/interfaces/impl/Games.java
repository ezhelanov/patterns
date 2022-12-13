package egorka.pomidorka.interfaces.impl;

import egorka.pomidorka.interfaces.Thinkable;

public class Games implements Thinkable {
    @Override
    public void think() {
        System.out.println("Thinking about games");
    }
}
