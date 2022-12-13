package egorka.pomidorka.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterator<Integer> {

    private final List<Integer> numbers;

    private int position;

    private int evenPosition;

    public EvenIterator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        for (int i = position; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                evenPosition = i;
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer next() throws NoSuchElementException {

        if (hasNext()) {
            Integer number = numbers.get(evenPosition);
            position = evenPosition + 1;
            return number;
        }

        throw new NoSuchElementException();
    }
}
