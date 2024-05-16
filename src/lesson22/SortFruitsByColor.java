package lesson22;

import java.util.Comparator;

public class SortFruitsByColor implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return Integer.compare(o1.getColor().ordinal(), o2.getColor().ordinal());
    }
}
