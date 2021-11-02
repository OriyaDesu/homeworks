package animals;

public class Fish extends Carnivorous implements Swim {
    public String toString(){
        return "Рыба";
    }
    @Override
    public void swim() {
        System.out.println("Рыба плавает. ");
    }
}
