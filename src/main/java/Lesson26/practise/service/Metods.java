package Lesson26.practise.service;


import Lesson26.practise.db.DefaultDictionary;
import Lesson26.practise.model.Dictionary;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Metods {
    private DefaultDictionary defaultDictionary;
    private Dictionary dictionary;


    public Metods() {
        dictionary = new Dictionary();
        defaultDictionary = new DefaultDictionary();
        defaultDictionary.defaultVocabulary();
    }



    public void addWord(String word, String translation){
        Set<String> translateSet = new HashSet<>();
        if(!dictionary.getDictionary().containsKey(word)){
            translateSet.add(translation);
            dictionary.getDictionary().put(word, translateSet);
        }
        dictionary.getDictionary().get(word).add(translation);
    }


    public void showWord(String word) {
    }

    public void addTranslation(String word, String addTranslation) {
    }

    public void changeTranslation(String word, String oldTranslation, String newTranslation) {
    }

    public void deleteTranslation(String word, String deleteTranslation) {
    }

    public void showDictionary() {
        
    }

    public void addNewWord(String word) {
    }

    public void changeWord(String word, String newWord) {
    }

    public void deleteWord(String word) {
    }
}
