package egorka.pomidorka.factory;

import egorka.pomidorka.abstractfactory.MyAbstractFactory;
import egorka.pomidorka.interfaces.Thinkable;
import egorka.pomidorka.interfaces.impl.*;

public class ThinkableFactory implements MyAbstractFactory<Thinkable> {

    @Override
    public Thinkable get(String theme) {
        if ("Games".equalsIgnoreCase(theme)) {
            return new Games();
        }
        if ("Music".equalsIgnoreCase(theme)) {
            return new Music();
        }
        if ("ladies".equalsIgnoreCase(theme)) {
            return new Ladies();
        }
        return null;
    }

}
