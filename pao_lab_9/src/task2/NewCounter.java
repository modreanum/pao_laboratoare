package task2;

import java.util.*;

public class NewCounter implements WordCounter {
    private TreeMap<String, Integer> words;

    public NewCounter() {
        words = new TreeMap<>();
    }

    @Override
    public void parse(String text) {
        String[] words2 = text.split("[\\s.,]+");
        for (String word : words2) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }
    }

    @Override
    public int getCount(String word) {
        return words.getOrDefault(word, 0);
    }

    @Override
    public SortedSet<String> getUniqueWords() {
        return new TreeSet<>(words.keySet());
    }

    @Override
    public void printWordCounts() {
        words.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }

    @Override
    public void reset() {
        words.clear();
    }
}
