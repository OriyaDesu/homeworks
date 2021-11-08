package animals;


public class Fox extends Carnivorous implements Voice, Run {
    public Fox(String animalName, int animalSize){
        super(animalName, animalSize);
    }

    public String toString(){
        return "Лиса";
    }
    @Override
    public void run() {
        System.out.println("Лиса бежит");
    }

    @Override
    public String voice() {
        return "Лиса рычит";
    }

}