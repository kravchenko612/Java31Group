package lesson25.HomeWork.olddictionary;

import java.util.*;

public class Dictionary {
    private Word word;
    private Map<String, Set<String>> dictionary = new HashMap<>();

    public Dictionary() {
    }

    public Dictionary(Map<String, Set<String>> dictionary) {
        this.dictionary = dictionary;
    }

    public Map<String, Set<String>> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, Set<String>> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "dictionary=" + dictionary +
                '}';
    }

}
