package animals;

public class Giraffe extends Herbivore implements Run, Voice {

    public Giraffe(String animalName, int animalSize) {
        super(animalName, animalSize);
    }

    public String toString(){
        return "Жираф";
    }

    @Override
    public void run() {
        System.out.println("Жираф бежит");
    }

    @Override
    public String voice() {
        return "Жираф орет";
    }
}