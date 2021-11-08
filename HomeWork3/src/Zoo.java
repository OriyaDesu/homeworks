import WrongAvairyException.WrongAviaryException;
import animals.*;
import aviary.Aviary;
import aviary.AviarySize;
import food.*;

public class Zoo {
    public static void main(String[] args) throws WrongAviaryException, WrongFoodException {
        Rabbit rabbit = new Rabbit("Кролик", 4);
        Spinach spinach = new Spinach();
        Steak steak = new Steak();
        Worker worker = new Worker();
        worker.getVoice(rabbit);
        worker.feed(rabbit, steak);

        Carnivorous wolf2 = new Wolf("Хищный волк", 9);
        Aviary<Carnivorous> carnivorousAviary = new Aviary<>(AviarySize.XXL);
        carnivorousAviary.addAnimal(wolf2);
        carnivorousAviary.removeAnimal(wolf2);
        carnivorousAviary.getLinkOnAnimalInAviary("Хищный волк");

        Herbivore duck2 = new Duck("Травоядная утка", 3);
        Aviary<Herbivore> herbivoreAviary = new Aviary<>(AviarySize.SMALL);
        herbivoreAviary.addAnimal(duck2);
    }
}

