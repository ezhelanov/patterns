package egorka.pomidorka.provider;

import egorka.pomidorka.abstractfactory.MyAbstractFactory;
import egorka.pomidorka.factory.ColorFactory;
import egorka.pomidorka.factory.PlayableFactory;
import egorka.pomidorka.factory.ThinkableFactory;

public class MyFactoryProvider {

    public MyAbstractFactory getFactory(String choice) {
        if ("Playable".equalsIgnoreCase(choice)) {
            return new PlayableFactory();
        }
        if ("Thinkable".equalsIgnoreCase(choice)) {
            return new ThinkableFactory();
        }
        return null;
    }

}
