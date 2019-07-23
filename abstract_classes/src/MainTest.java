import com.september.Atlantis;
import com.september.Enemy;
import com.september.Hero;


import java.util.ArrayList;
/**
 * 
 * @author vitalii22
 *Тестирую Абстрактные классы. - это такой класс, объект которого невозможно создать
 *Абстрактные классы используются тогда, когда родственные подклассы имеют одну чать
 *методов одинаковую, а вторую разную. Первая часть похожих реализуется в Абстрактном классе
 *вторая часть реализуется в подклассах.
 *Примеры Абстрактных классов - Фигура, Игрок, Автомобиль:
 */

public class MainTest {
    public static void main(String[] args) {
        Hero atlantis = new Atlantis("Atlantis");

        System.out.println(atlantis.getDescription());

        ArrayList<Hero> mainheroes = new ArrayList<>(); //списочный Массив аналог списка в Питоне
        //Все объекты наследуют от Абстрактного класса Hero. поэтому они все могут хранится в списке с типом Hero
     
        Hero Zic = new Atlantis("Зитц"); //
        Hero evilPimpl = new Enemy("Пимпл");
        Enemy core = new Enemy("Core");
        
        //враги и герои в одной упряжке //ПРОТИВОРЕЧИТ ПОЛИМОРФИЗМУ, т.к. ГЕРОИ И ЗЛОДЕИ РАЗНЫЕ СУЩНОСТИ
        
        mainheroes.add(evilPimpl); // интерфейс списочного Массива позволяет добавлять элементы
        mainheroes.add(Zic);
        mainheroes.add(core);
        mainheroes.add(atlantis);
        
        System.out.println();

        int [] numberInTeam = new int[3];
        
        for (int i = 0; i < numberInTeam.length; i++) 
        {
            numberInTeam[i] = i;
        }
        
        System.out.println("Имена всех учатников программы");
        for(Hero j : mainheroes)
        {
            System.out.println(j.getName());
        }
        for (int x:numberInTeam)
            System.out.println(x);
        
        System.out.println();
        System.out.println("Остерегайся, Смертный, Сейчас будет СВЕРХСИЛА");
        System.out.println();
        
        for (Hero h: mainheroes)
        {	
        	System.out.print(h.getName() + ' ');
        	h.heroPower();
        	System.out.println();
        	
        }
    }
}
