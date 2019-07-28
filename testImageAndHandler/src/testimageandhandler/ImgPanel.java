/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testimageandhandler;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class ImgPanel extends JPanel implements ActionListener{
    
    Timer timer;
    Image hero;
    private int heroX = 1;
    private int heroY = 1;
    
    
    public ImgPanel() {
        loadImage();
        timer = new Timer(250, this);
    }
    //загрузка изображения
    public void loadImage(){
        ImageIcon icon = new ImageIcon("D:\\Code_Code_Code\\Java-Core-\\"
                + "testImageAndHandler\\src\\res\\Hero.png");
        hero = icon.getImage();
    }
    //нарисуем на панели картинку героя
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); 
        grphcs.drawImage(hero, heroX, heroY, this);
       
    }
    //перерисовка кадра
    @Override
    public void actionPerformed(ActionEvent ae) {
     
        repaint(1);
    }

  

    
    
    
}
