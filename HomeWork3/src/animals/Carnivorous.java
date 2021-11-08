package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public class Carnivorous extends Animal {

    public Carnivorous(String animalName, int animalSize){
        super(animalName, animalSize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat){
            satiety += food.getFoodValue();
            System.out.println(" кушает " + food + ". Уровень сытости - " + satiety);
        }else {
          throw new WrongFoodException(" не кушает " + food + ". Дайте ему мясо. ");
        }
    }
}
