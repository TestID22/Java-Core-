import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Road extends JPanel implements ActionListener, Runnable {

    Timer mainTimer = new Timer(20, this);
    //картинка дороги
    Image road = new ImageIcon("D:\\Code_Code_Code\\Java-Core-\\MARs\\src\\main\\resources\\road.jpg").getImage();
    //игрок
    Player player = new Player();

    Thread enemyThread = new Thread(this);

    ArrayList <Enemy> enemies = new ArrayList<Enemy>();


    Road(){
        //Main Loop for game;
        mainTimer.start();
        enemyThread.start();
    }
    //рисуем дорогу кастим при этом g к 2D
    public void paint(Graphics g){
        g = (Graphics2D) g;
        g.drawImage(road, player.layer1,0, null);
        g.drawImage(road, player.layer2,0, null);
        g.drawImage(player.img , player.x, player.y, null);

        //берём итератор для поштучного прохождения по коллекции.
        Iterator<Enemy> iter = enemies.iterator();
        while (iter.hasNext()){
            Enemy enemy = iter.next();
            if(enemy.enemyX >= 682 || enemy.enemyY >= 1083){
                iter.remove();
            }else
                g.drawImage(enemy.image, enemy.enemyX, enemy.enemyY, null);
                enemy.move();
        }
    }

    public void actionPerformed(ActionEvent e) {
        player.move();
        repaint();
    }


    public void run() {
        while (true){
            Random rand = new Random();
            try {
                enemyThread.sleep(4000);
                enemies.add(new Enemy(rand.nextInt(1400), rand.nextInt(100), this));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
