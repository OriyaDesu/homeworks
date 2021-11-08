package animals;

public class Fish extends Carnivorous implements Swim {
    public Fish(String animalName, int animalSize){
        super(animalName, animalSize);
    }

    public String toString(){
        return "Рыба";
    }
    @Override
    public void swim() {
        System.out.println("Рыба плавает. ");
    }
}
