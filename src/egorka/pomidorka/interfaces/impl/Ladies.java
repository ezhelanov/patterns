package egorka.pomidorka.interfaces.impl;

import egorka.pomidorka.interfaces.Thinkable;

public class Ladies implements Thinkable {
    @Override
    public void think() {
        System.out.println("Thinking about ladies");
    }
}
