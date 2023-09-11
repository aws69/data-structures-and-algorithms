package animalShelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AnimalShelterTest {

    @Test
    void testAnimalShelter() {
        AnimalShelter shelter = new AnimalShelter();

        Animal cat1 = new Animal("cat", "Whiskers");
        Animal dog1 = new Animal("dog", "Fido");
        Animal cat2 = new Animal("cat", "Fluffy");
        Animal dog2 = new Animal("dog", "Buddy");

        shelter.enqueue(cat1);
        shelter.enqueue(dog1);
        shelter.enqueue(cat2);
        shelter.enqueue(dog2);

        System.out.println("Dequeue a cat: " + shelter.dequeue("cat").getName()); // Expect: Whiskers
        System.out.println("Dequeue a dog: " + shelter.dequeue("dog").getName()); // Expect: Fido
        System.out.println("Dequeue any animal: " + shelter.dequeue().getName()); // Expect: Fluffy

        Animal cat3 = new Animal("cat", "Mittens");
        Animal dog3 = new Animal("dog", "Rocky");

        shelter.enqueue(cat3);
        shelter.enqueue(dog3);

        System.out.println("Dequeue a cat: " + shelter.dequeue("cat").getName()); // Expect: Mittens
        System.out.println("Dequeue a dog: " + shelter.dequeue("dog").getName()); // Expect: Rocky

        System.out.println("Dequeue a bird: " + shelter.dequeue("bird")); // Expect: null


    }
}
