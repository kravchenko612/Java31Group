package lesson25.HomeWork.olddictionary;

import java.util.HashMap;
import java.util.Map;

public class DefaultDictionary {
    private Word word;

    public DefaultDictionary() {
    }

    public void defaultVocabulary() {
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("January", "січень");
        dictionary.put("February", "лютий");
        dictionary.put("March", "березень");
        dictionary.put("April", "квітень");
        dictionary.put("May", "травень");
        dictionary.put("June", "червень");
        dictionary.put("July", "липень");
        dictionary.put("August", "серпень");
        dictionary.put("September", "вересень");
        dictionary.put("October", "жовтень");
        dictionary.put("November", "листопад");
        dictionary.put("December", "грудень");
    }
}
