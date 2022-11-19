package P3_Wild_Farm;

public abstract class Animal {
    private String animalType;
    private String animalName;
    private Double animalWeight;
    private Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public Double getAnimalWeight() {
        return this.animalWeight;
    }

    public Integer getFoodEaten() {
        return this.foodEaten;
    }

    protected void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    protected abstract void makeSound();
}
