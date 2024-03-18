package lesson8.homework;

public class Pet {
    // Fields
    private String name;
    private int age;
    private String species;

    // Constructor
    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    // Additional method
    public void speak() {
        switch (species.toLowerCase()) {
            case "dog":
                System.out.println("Woof!");
                break;
            case "cat":
                System.out.println("Meow!");
                break;
            default:
                System.out.println("I am a " + species + ".");
        }
    }
}