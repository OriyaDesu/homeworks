package animals;

public class Rabbit extends Herbivore implements Voice, Run {

    public String toString(){
        return "Кролик";
    }

    @Override
    public void run() {
        System.out.println("Кролик бежит");
    }

    @Override
    public String voice() {
        return "Кролик пищит";
    }
}