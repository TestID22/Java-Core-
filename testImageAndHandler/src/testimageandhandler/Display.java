/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testimageandhandler;

import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Display extends JFrame{
    //создадим панель
    ImgPanel panel;
        //константы размера фрейма
    final int screenWidth = 500;
    final int screenHeight = 187;
    //иконка 
    ImageIcon iconF = new ImageIcon("D:\\Code_Code_Code\\Java-Core-\\"
            + "testImageAndHandler\\src\\res\\icon.png");
    Image image = iconF.getImage();
    
    public Display() throws HeadlessException {
        setSize(screenWidth, screenHeight);
        setTitle("Чмунь - X:Месть Вени");
        setVisible(true);
        setResizable(false);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(image);
        panel = new ImgPanel();
        add(panel);
        
    }
    
}
