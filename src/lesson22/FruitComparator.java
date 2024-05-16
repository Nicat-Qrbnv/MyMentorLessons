package lesson22;

import java.util.Comparator;

class FruitComparator implements Comparator<Fruit> {
        @Override
        public int compare(Fruit o1, Fruit o2) {
            if (o1.getWeight() > o2.getWeight()) {
                return 1;
            } else if (o1.getWeight() < o2.getWeight()) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        }
    }