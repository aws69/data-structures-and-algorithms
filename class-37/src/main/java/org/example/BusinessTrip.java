package org.example;
import java.util.HashMap;
public class BusinessTrip {
    private final HashMap<String, HashMap<String, Integer>> graph;

    public BusinessTrip(HashMap<String, HashMap<String, Integer>> graph) {
        this.graph = graph;
    }
    public Integer calculateTripCost(String[] cities) {
        if (cities.length < 2) {
            return null; // Cannot have a trip with less than two cities
        }

        int totalCost = 0;
        for (int i = 0; i < cities.length - 1; i++) {
            String currentCity = cities[i];
            String nextCity = cities[i + 1];

            if (!graph.containsKey(currentCity) || !graph.get(currentCity).containsKey(nextCity)) {
                return null; // Direct flight between cities not found
            }
            totalCost += graph.get(currentCity).get(nextCity);
        }
        return totalCost;
    }
}

