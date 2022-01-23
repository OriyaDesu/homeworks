import animals.*;
import food.*;

public class Zoo {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();
        Fox fox = new Fox();
        Giraffe giraffe = new Giraffe();
        Rabbit rabbit = new Rabbit();
        Wolf wolf = new Wolf();

        Beef beef = new Beef();
        ChickenMeat chickenMeat = new ChickenMeat();
        Steak steak = new Steak();
        Cucumber cucumber = new Cucumber();
        Cabbage cabbage = new Cabbage();
        Spinach spinach = new Spinach();

        Worker worker = new Worker();

        worker.feed(fox, spinach);
        worker.feed(fox, chickenMeat);
        worker.feed(giraffe, cucumber);
        worker.feed(wolf, beef);
        worker.feed(rabbit, steak);
        worker.feed(rabbit, cabbage);

        worker.getVoice(fox);
        worker.getVoice(rabbit);

        Swim[] prude = {duck, fish};
        for (Swim animal : prude) {
            animal.swim();
        }
    }
}

