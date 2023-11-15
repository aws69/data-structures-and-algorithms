package org.example;

import java.util.HashSet;

public class UniqueCharacters {

    public static boolean hasUniqueCharacters(String str) {
        HashSet<Character> unique = new HashSet<>();

        for (char character : str.toCharArray()) {
            if (character != ' ') {
                if (unique.contains(character)) {
                    return false;
                } else {
                    unique.add(character);
                }
            }
        }
        return true;
    }
}
