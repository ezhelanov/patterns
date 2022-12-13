package egorka.pomidorka.abstractfactory;

public interface MyAbstractFactory<T> {
    T get(String type);
}
