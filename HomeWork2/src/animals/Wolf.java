package animals;

public class Wolf extends Carnivorous implements Voice, Run {
    public String toString(){
        return "Волк";
    }

    @Override
    public void run() {
        System.out.println("Волк бежит");
    }

    @Override
    public String voice() {
        return "Волк рычит";
    }

}