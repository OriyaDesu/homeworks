package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public class Herbivore extends Animal {
    public Herbivore(String animalName, int animalSize) {
        super(animalName, animalSize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            satiety += food.getFoodValue();
            System.out.println(" кушает " + food + ". Уровень сытости - " + satiety);
        } else {
            throw new WrongFoodException("Это животное не ест " + food + ". Дайте ему травы.");
        }
    }
}
