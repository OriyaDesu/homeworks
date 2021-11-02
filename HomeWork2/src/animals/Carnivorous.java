package animals;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            satiety += food.getFoodValue();
            System.out.println(" кушает " + food + ". Уровень сытости - " + satiety);
        }else {
            System.out.println(" не кушает " + food + ". Дайте ему мясо. ");
        }
    }
}
