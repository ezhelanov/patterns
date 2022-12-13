package egorka.pomidorka;

import egorka.pomidorka.abstractfactory.MyAbstractFactory;
import egorka.pomidorka.interfaces.Playable;
import egorka.pomidorka.interfaces.Thinkable;
import egorka.pomidorka.provider.MyFactoryProvider;

public class Main {

    public static void main(String[] args) {

        MyFactoryProvider factoryProvider = new MyFactoryProvider();

        MyAbstractFactory<Playable> playableFactory = factoryProvider.getFactory("playable");
        playableFactory.get("doomEternal").play();
        playableFactory.get("farcry").play();

        MyAbstractFactory<Thinkable> thinkableFactory = factoryProvider.getFactory("thinkable");
        thinkableFactory.get("games").think();
        thinkableFactory.get("music").think();

    }
}
