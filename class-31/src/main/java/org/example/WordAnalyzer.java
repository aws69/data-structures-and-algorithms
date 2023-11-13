package org.example;
import java.util.*;
public class WordAnalyzer {
    public static String repeatedWord(String input) {
        input = input.toLowerCase();
        String[] words = input.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            if (wordFrequency.get(word) > 1) {
                return word;
            }
        }return null;
    }
    public static List<String> mostFrequentWords(String input, int numWords) {
        if (input == null || input.isEmpty() || numWords <= 0) {
            return Collections.emptyList();
        }
        String[] words = input.split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>((entry1, entry2) -> {
            int frequencyComparison = Integer.compare(entry2.getValue(), entry1.getValue());
            return frequencyComparison != 0 ? frequencyComparison : entry1.getKey().compareTo(entry2.getKey());
        });
        maxHeap.addAll(wordCounts.entrySet());
        List<String> mostFrequentWords = new ArrayList<>();
        while (mostFrequentWords.size() < numWords && !maxHeap.isEmpty()) {
            mostFrequentWords.add(maxHeap.poll().getKey());
        }return mostFrequentWords;
    }
}

