import model.Kotik;
import java.util.Objects;

public class Application {
    public static void main(String[] args){
        Kotik firstKotik = new Kotik(10, "Гуччи", 3,"Мяу мяу",10);
        Kotik secondKotik = new Kotik();
        secondKotik.setKotik(10, "Салем", 2, "Где Сбарина?");
        firstKotik.liveAnotherDay();
        System.out.println("Котика зовут - "+firstKotik.getName()+". Его вес - "+firstKotik.getWeight()+" кг.");
        if (firstKotik.getMeow().equals(secondKotik.getMeow())){
            System.out.println("Котики разговаривают одинаково");
        } else{
            System.out.println("Котики разговаривают по-разному");
        }
        System.out.println("Котиков всего - "+Kotik.count+".");
    }
}
