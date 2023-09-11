package animalShelter;

import java.util.LinkedList;
import java.util.Queue;

class AnimalShelter {
    private final Queue<Animal> dogQueue;
    private final Queue<Animal> catQueue;
    private int order;
    public AnimalShelter() {
        dogQueue = new LinkedList<>();
        catQueue = new LinkedList<>();
        order = 0;
    }
    public void enqueue(Animal animal) {
        animal.setOrder(order++);
        if (animal.getSpecies().equals("dog")) {
            dogQueue.offer(animal);
        } else if (animal.getSpecies().equals("cat")) {
            catQueue.offer(animal);
        }
    }
    public Animal dequeue(String pref) {
        if (pref.equals("dog")) {
            return dogQueue.poll();
        } else if (pref.equals("cat")) {
            return catQueue.poll();
        } else {
            return null;
        }
    }
    public Animal dequeue() {
        if (!dogQueue.isEmpty() && !catQueue.isEmpty()) {
            return (dogQueue.peek().getOrder() < catQueue.peek().getOrder()) ? dogQueue.poll() : catQueue.poll();
        } else if (!dogQueue.isEmpty()) {
            return dogQueue.poll();
        } else if (!catQueue.isEmpty()) {
            return catQueue.poll();
        } else {
            return null;
        }
    }
}
