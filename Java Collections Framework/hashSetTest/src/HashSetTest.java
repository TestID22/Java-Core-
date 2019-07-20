
import java.util.*;
import java.lang.reflect.Method;
import java.sql.Ref;

/**
 * @author Vitalii September22
 * тестирую Collection Frameworks - это основы, особенно для EE
 * Нужно читать МакКонела или Фаулера, чтоб не писать ужасный код.
 * P.S. Любите Код)
 *
 */
//Множества
public class HashSetTest {
    public static void main(String[] args) throws NullPointerException{

     /* Set <String> words = new HashSet<>();
        Scanner in = new Scanner(System.in);
        long totalTime = 0;
        while (in.hasNext())
        {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime; //Время выполнения обработки
            totalTime += callTime;
        }
        Iterator<String> iter = words.iterator();
        for (int i = 1;i <=20; i++)
            System.out.println(iter.next());
       */


        Players Handanovich = new Golkeeper("Samir");
        Players Icardi = new FieldPlayer("Mauro");

        System.out.println("Вывод на экран из Хеш - Множества");
        Set <Players> team = new HashSet<>();

        team.add(Handanovich);
        team.add(Icardi);
        team.add(Icardi);

        team.forEach(e -> System.out.println(e.getName()));

        System.out.println();
        System.out.println("Вывод на экран из Списочного массива");
        ArrayList <Players> teamArray = new ArrayList<>();

        teamArray.add(Handanovich);
        teamArray.add(Icardi);
        teamArray.add(Icardi);

        teamArray.forEach(e-> System.out.println(e.getName()));

        System.out.println();
        System.out.println("Тут рефексия класса Ханданович");

        Reflected reflecetedGoalkeepres = new Reflected();
        reflecetedGoalkeepres.getMethods(Handanovich);




    }
}

class Players {
    private String name;
    public Players(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Golkeeper extends Players{
    public Golkeeper(String name) {
        super(name);
    }
    public void playHand(){
        System.out.println("Ханданович тянет тяжелейший мяч");
    }
    private void playHard(){
        System.out.println("Ханда - тащер");
    }
}

class FieldPlayer extends Players {
    public FieldPlayer(String name) {
        super(name);
    }

}

class Reflected{
    public void getMethods(Object ob){
        Class cl = ob.getClass();
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods)
            System.out.println(m.getName());
    }
}