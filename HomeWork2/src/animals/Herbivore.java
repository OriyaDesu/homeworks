package animals;

import food.Food;
import food.Grass;

public class Herbivore extends Animal{
    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            satiety += food.getFoodValue();
            System.out.println(" кушает " + food + ". Уровень сытости - "+satiety);
        }else {
            System.out.println(" не кушает " + food + ". Дайте ему зелень. " );
        }
    }
}
