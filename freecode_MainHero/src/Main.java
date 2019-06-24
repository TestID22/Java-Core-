import com.september.Enemy;
import com.september.Hero;

public class Main {
    public static void main(String[] args) {
        Hero main = new Hero(100, 10);
        Enemy minion = new Enemy(100);
        int x = 10;
        while (x > 0) {
            main.attackEnemy(minion);
            x--;
        }
        System.out.println(minion.getHp());


    }
}
