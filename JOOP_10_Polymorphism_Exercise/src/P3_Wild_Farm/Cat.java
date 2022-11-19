package P3_Wild_Farm;

import java.text.DecimalFormat;

public class Cat extends Feline {
    protected String breed;

    public Cat(String animalName, String animalType, Double animalWeight,
               String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]",
                getAnimalType(), getAnimalName(), this.breed, df.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());

    }
}
