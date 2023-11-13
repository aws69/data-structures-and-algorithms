package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LeftJoin {

    public static List<List<String>> leftJoin(Map<String, String> synonyms, Map<String, String> antonyms) {
        List<List<String>> result = new ArrayList<>();

        for (String key : synonyms.keySet()) {
            List<String> row = new ArrayList<>();
            row.add(key);
            row.add(synonyms.get(key));

            row.add(antonyms.getOrDefault(key, null));

            result.add(row);
        }

        return result;
    }
}