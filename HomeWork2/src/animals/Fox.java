package animals;


public class Fox extends Carnivorous implements Voice, Run {
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