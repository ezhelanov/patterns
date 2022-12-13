package egorka.pomidorka.factory;

import egorka.pomidorka.abstractfactory.MyAbstractFactory;

import java.awt.*;

public class ColorFactory implements MyAbstractFactory<Color> {

    @Override
    public Color get(String colorType) {
        if ("Black".equalsIgnoreCase(colorType)) {
            return Color.BLACK;
        }
        if ("White".equalsIgnoreCase(colorType)) {
            return Color.WHITE;
        }
        return null;
    }

}
