package task1;

import java.util.*;


public class SortedListSet<T extends Comparable<T>>
        extends LinkedList<T> implements SortedSet<T> {

    private final Comparator<? super T> comparator;
    public SortedListSet() {
        this.comparator = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        };
    }
    public SortedListSet(Comparator<T> comparator){
        this.comparator=comparator;

    }

    @Override
    public Comparator<? super T> comparator() {
        return comparator;
    }

    @Override
    public SortedSet<T> subSet(T fromElement, T toElement) {

        return new TreeSet<>(super.subList(super.indexOf(fromElement), super.indexOf(toElement)));
    }

    @Override
    public SortedSet<T> headSet(T toElement) {
        return new TreeSet<>(super.subList(0, super.indexOf(toElement)));
    }

    @Override
    public SortedSet<T> tailSet(T fromElement) {
        return new TreeSet<>(super.subList(super.indexOf(fromElement), super.size()));
    }

    @Override
    public T first() {
        return super.getFirst();
    }

    @Override
    public T last() {
        return super.getLast();
    }

    @Override
    public boolean add(T t) {
        if (contains(t)) {
            return false;
        } else {
            int ind = Collections.binarySearch(this, t, comparator);
            if (ind <= -1) {
                ind = -1 - ind;
            }
            super.add(ind, t);
            return true;
        }
    }


}
