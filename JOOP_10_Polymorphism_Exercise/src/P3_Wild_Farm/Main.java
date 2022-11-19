package P3_Wild_Farm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalInput = scanner.nextLine();
        List<Animal> animals = new ArrayList<>();

        while (!animalInput.equals("End")) {
            String[] tokensAnimal = animalInput.split(" ");
            Animal animal = getAnimal(tokensAnimal);

            String[] foodTokens = scanner.nextLine().split(" ");

            animal.makeSound();

            Food food = getFood(foodTokens);

            try {
                animal.eat(food);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            animals.add(animal);

            animalInput = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static Food getFood(String[] foodTokens) {
        String foodType = foodTokens[0];
        Integer foodQuantity = Integer.valueOf(foodTokens[1]);


        switch (foodType) {
            case "Vegetable":
                return new Vegetable(foodQuantity);
            case "Meat":
                return new Meat(foodQuantity);
            default:
                throw new IllegalArgumentException("No such food" + foodType);
        }

    }

    private static Animal getAnimal(String[] tokens) {
        String animalType = tokens[0];
        String animalName = tokens[1];
        Double animalWeight = Double.valueOf(tokens[2]);
        String animalLivingRegion = tokens[3];

        switch (animalType) {
            case "Cat":
                String catBreed = tokens[4];
                return new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);
            case "Tiger":
                return new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
            case "Mouse":
                return new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
            case "Zebra":
                return new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
            default:
                throw new IllegalArgumentException("No such animal" + animalType);
        }
    }
}
