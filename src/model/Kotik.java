package model;

public class Kotik {
    private int satiety;
    private int prettiness;
    private String name;
    private int weight;
    private String meow;

    public static int count;

    public Kotik() {
        count++;
    }

    public Kotik(int prettiness, String name, int weight, String meow, int satiety) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.satiety = satiety;
        count++;

    }
    public void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    private void eat(int unitsSatiety){
        satiety = satiety + unitsSatiety;
    }

    private void eat(String nameFood, int unitsFood){
        eat(unitsFood);
        System.out.println("Котик кушает "+nameFood+" + "+unitsFood+" к сытости. Уровень сытости - "+satiety);
    }

    private void eat(){
        eat("Корм", 6);
    }

    private boolean hungry(){
        return satiety <= 0;
    }

    private boolean play(){
        if (hungry()){
            return false;
        }
        satiety = satiety - 4;
        System.out.println("Котик играет. "+"Уровень сытости - "+satiety+".");
        return true;
    }

    private boolean sleep(){
        if (hungry()){
            return false;
        }
        satiety = satiety - 2;
        System.out.println("Котик спит. "+"Уровень сытости - "+satiety+".");
        return true;
    }

    private boolean chaseMouse(){
        if (hungry()){
            return false;
        }
        satiety = satiety - 4;
        System.out.println("Котик преследует мышь. "+"Уровень сытости - "+satiety+".");
        return true;
    }

    private boolean walk(){
        if (hungry()){
            return false;
        }
        satiety = satiety - 2;
        System.out.println("Котик гуляет. "+"Уровень сытости - "+satiety+".");
        return true;
    }

    private boolean posing(){
        if (hungry()){
            return false;
        }
        satiety = satiety - 2;
        System.out.println("Котик позирует для фото. "+"Уровень сытости - "+satiety+".");
        return true;
    }

    public void liveAnotherDay(){
        for(int i = 0; i < 24; i++){
            switch ((int) (Math.random()*5+1)){
                case 1:
                    if (!play()){
                        eat();
                }
                break;
                case 2:
                    if (!sleep()){
                        eat();
                    }
                break;
                case 3:
                    if (!chaseMouse()){
                        eat();
                }
                break;
                case 4:
                    if (!walk()){
                    eat();
                }
                break;
                case 5:
                   if (!posing()){
                       eat();
                   }
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getSatiety() {
        return satiety;
    }
}
