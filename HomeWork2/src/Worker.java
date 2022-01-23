import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food) {
        System.out.print("Рабочий принес еду. " + animal);
        animal.eat(food);
    }

    public void getVoice (Voice animal) {
        System.out.println("Рабочий дал команду голос - " + animal.voice());
    }
}
