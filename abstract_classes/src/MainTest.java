import com.september.Atlantis;
import com.september.Enemy;
import com.september.Hero;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        Atlantis atlantis = new Atlantis("Atlantis");

        System.out.println(atlantis.getDescription());

        ArrayList<Hero> mainheroes = new ArrayList<>(3); //списочный Массив аналог списка в Питоне
        //Все объекты наследуют от Абстрактного класса Hero. поэтому они все могут хранится в списке с типом Hero
        //
        Hero Zic = new Atlantis("Зитц"); //
        Enemy evilPimpl = new Enemy("Пимпл");
        Enemy core = new Enemy("Core");
        //враги и герои в одной упряжке
        mainheroes.add(evilPimpl); // интерфейс списочного Массива позволяет добавлять элементы
        mainheroes.add(Zic);
        mainheroes.add(core);
        mainheroes.add(atlantis);


        int [] numberInTeam = new int[3];
        for (int i = 0; i < numberInTeam.length; i++) {
            numberInTeam[i] = i;
        }
        System.out.println("Имена всех учатников программы");
        for(Hero j : mainheroes){
            System.out.println(j.getName());
        }
        for (int x:numberInTeam)
            System.out.println(x);


    }
}
