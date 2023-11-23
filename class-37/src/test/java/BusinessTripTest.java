import org.example.BusinessTrip;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BusinessTripTest {

    @Test
    public void testCalculateTripCost_ValidTrip() {
        HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();
        graph.put("Amman", new HashMap<>() {{
            put("Aqaba", 150);
            put("Dead Sea", 100);
        }});
        graph.put("Aqaba", new HashMap<>() {{
            put("Amman", 150);
        }});
        graph.put("Dead Sea", new HashMap<>() {{
            put("Amman", 100);
        }});

        BusinessTrip businessTrip = new BusinessTrip(graph);
        String[] tripCities = {"Amman", "Aqaba"};
        Integer cost = businessTrip.calculateTripCost(tripCities);
        assertEquals(150, cost);
        System.out.println("Cost of the trip (Amman -> Aqaba): " + cost);
    }

    @Test
    public void testCalculateTripCost_InvalidTrip_NoDirectFlight() {
        HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();
        graph.put("Amman", new HashMap<>() {{
            put("Aqaba", 150);
        }});

        BusinessTrip businessTrip = new BusinessTrip(graph);
        String[] tripCities = {"Amman", "Dead Sea"};
        Integer cost = businessTrip.calculateTripCost(tripCities);
        assertNull(cost);
        System.out.println("Cost of the trip (Amman -> Dead Sea): No direct flight available");
    }

    @Test
    public void testCalculateTripCost_InvalidTrip_LessThanTwoCities() {
        HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();
        BusinessTrip businessTrip = new BusinessTrip(graph);
        String[] tripCities = {"Amman"};
        assertNull(businessTrip.calculateTripCost(tripCities));
        System.out.println("Cost of the trip (Amman): Trip must have at least two cities");
    }
}
