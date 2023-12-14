package lesson25.HomeWork.olddictionary;

import java.util.HashSet;

public class Metods {
    private DefaultDictionary defaultDictionary;
    private Dictionary dictionary;
    public Metods() {
        dictionary = new Dictionary();
        defaultDictionary = new DefaultDictionary();
        defaultDictionary.defaultVocabulary();
    }
    public void addWord(String word, String translation){
        HashSet<String> temSet = new HashSet<>();
        if(!dictionary.getDictionary().containsKey(word)){
            temSet.add(translation);
            dictionary.getDictionary().put(word, temSet);
        }
        dictionary.getDictionary().get(word).add(translation);
    }


}
