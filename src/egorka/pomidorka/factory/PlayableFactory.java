package egorka.pomidorka.factory;

import egorka.pomidorka.abstractfactory.MyAbstractFactory;
import egorka.pomidorka.interfaces.impl.Crysis;
import egorka.pomidorka.interfaces.impl.DoomEternal;
import egorka.pomidorka.interfaces.impl.FarCry;
import egorka.pomidorka.interfaces.Playable;

public class PlayableFactory implements MyAbstractFactory<Playable> {

    @Override
    public Playable get(String playableType) {
        if ("DoomEternal".equalsIgnoreCase(playableType)) {
            return new DoomEternal();
        }
        if ("Crysis".equalsIgnoreCase(playableType)) {
            return new Crysis();
        }
        if ("FarCry".equalsIgnoreCase(playableType)) {
            return new FarCry();
        }
        return null;
    }

}
