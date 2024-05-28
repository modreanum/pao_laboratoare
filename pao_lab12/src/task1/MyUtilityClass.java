package task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BiFunction;

public class MyUtilityClass {


    public static <T,U> U aggregate(Collection<T> collection, U startValue, BiFunction<U, T, U> function) {

        for (T t : collection) {
            startValue = function.apply(startValue, t);
        }
        return startValue;
    }
    public static void printCollection(Collection<?> collection) {
        System.out.println(collection);
    }
    public static <T> Collection<T> duplicateCollection(Collection<T> collection) {
        Collection<T> list = new ArrayList<>();
        for (T t : collection) {
            list.add(t);
            list.add(t);
        }
        return list;
    }
}
