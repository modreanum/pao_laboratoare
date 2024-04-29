package task1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        SortedListSet<Integer> list=new SortedListSet<>();
        SortedListSet<Integer> list2=new SortedListSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1%2-o2%2;
            }
        });
        list.add(3);
        list.add(2);
        list.add(5);
        for(Integer elem:list) {
            System.out.println(elem);
        }
        System.out.println(list.headSet(3));
        System.out.println(list.subSet(2,5));
        System.out.println(list.tailSet(3));


        list2.add(3);
        list2.add(2);
        list2.add(5);
        for(Integer elem:list2) {
            System.out.println(elem);
        }
        System.out.println(list2.headSet(3));
        System.out.println(list2.subSet(2,5));
        System.out.println(list2.tailSet(3));
    }
}
