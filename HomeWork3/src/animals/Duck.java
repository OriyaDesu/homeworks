package animals;

public class Duck extends Herbivore implements Fly, Swim, Voice, Run {
    public Duck(String animalName, int animalSize){
        super(animalName, animalSize);
    }

    public String toString(){
        return "Утка";
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
    }

    @Override
    public String voice() {
        return "Утка крякает";
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }
}

