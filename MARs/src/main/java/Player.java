import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

public class Player{

    Image img = new ImageIcon("D:\\Code_Code_Code\\Java-Core-\\MARs\\src\\main\\resources\\playerMAR22.jpg").getImage();

    int speed = 5;
    int acceleration = 0;
    int distance = 0;
    //координаты для машины.
    int x = 30;
    int y = 563;

    int layer1 = 0;
    int layer2 = 1023;

    //двигаем картинку.
    public void move(){
        //добавим управление.
        if(InputHandler.isPressed(KeyEvent.VK_UP))y -= 5;
        if(InputHandler.isPressed(KeyEvent.VK_DOWN))y += 5;

        distance += speed;
        if(layer2 - speed <= 0){
            layer1 = 0;
            layer2 = 1023;
        }else{
            layer1 -= speed;
            layer2 -= speed;
        }
    }
}
