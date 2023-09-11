package animalShelter;

class Animal {
    private final String species;
    private final String name;
    private int order;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}