/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vitaliiseptember.mavenprojecttest;

import java.awt.Canvas;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author vital
 */
public class Hero extends JPanel{
    private Image image;

    public Hero() {
        ImageIcon imageIcon = new ImageIcon("D:\\Code_Code_Code\\Java-Core-\\Socket and Web\\mavenproject1\\MavenProjectTest\\src\\main\\java\\res\\skelet.png");
        image = imageIcon.getImage();
    }
    public void render(Canvas canvas){
        
    }
            
}
