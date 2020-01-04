import javax.swing.*;
import java.awt.*;

public class Enemy {

    Image image = new ImageIcon("D:\\Code_Code_Code\\Java-Core-\\MARs\\src\\main\\resources\\playerMAR.jpg").getImage();

    int enemyX;
    int enemyY;
    int speed;
    Road road;


    public Enemy(int enemyX, int enemyY, Road road) {
       this.enemyX = enemyX;
       this.enemyY = enemyY;
       this.road = road;
    }
    public void move() {
        enemyX = enemyX - road.player.speed + speed;
    }
}
