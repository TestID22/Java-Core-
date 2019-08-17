/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vitaliiseptember.mavenprojecttest;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author vital
 */
public class Display extends JFrame{

    private JFrame frame;
    private static Canvas canvas;
    Hero hero = new Hero();
    //add buffers
    private static BufferedImage bufferedImage;
    private static int [] data;
    private static Graphics bufferedGtapGraphics;


    public Display() {
        frame = new JFrame("window");
        frame.setVisible(true);
        frame.setSize(1000,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(hero);
        
        canvas = new Canvas(){
            @Override
            public void paint(Graphics g) {
                super.paint(g); //To change body of generated methods, choose Tools | Templates.
                render(g);
            }
            
        };

        canvas.setBackground(Color.BLACK);
        frame.add(canvas);
        frame.getContentPane().add(canvas);
        
    }
    public static void render(){
        canvas.repaint();
    }
    public static void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect(20, 20, 30, 20);
        
        
    }
}
