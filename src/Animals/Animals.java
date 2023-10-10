package Animals;

import java.util.ArrayList;
import java.util.List;

public class Animals {

    private final List<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Animal getAnimal(int id) {
        Animal foundAnimal = null;
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                foundAnimal = animal;
            }
        }
        return foundAnimal;
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            String typeAnimal = "";
            if (animal instanceof Cat) {
                typeAnimal = "Кот (кошка)";
            }
            if (animal instanceof Dog) {
                typeAnimal = "Собака";
            }
            if (animal instanceof Hamster) {
                typeAnimal = "Хомяк";
            }
            if (animal instanceof Horse) {
                typeAnimal = "Лошадь";
            }
            if (animal instanceof Camel) {
                typeAnimal = "Верблюд";
            }
            if (animal instanceof Donkey) {
                typeAnimal = "Осел";
            }
            System.out.printf("%s: %d. %s, %s, команды: %s\n", typeAnimal, animal.getId(), animal.getName(), animal.getDateOfBirth(), animal.getCommands());
        }
    }

    @Override
    public String toString() {
        return String.format("%s", animals);
    }
}
