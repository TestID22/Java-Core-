/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vitaliiseptember.mavenprojecttest;


import javax.swing.Timer;

/**
 *
 * @author vital
 */
public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        //таймер перерисовывает экран Рендерит картинку, вызывая метод рендер
        Timer t = new Timer(1000/ 60, (ae) -> Display.render()){
        };
        t.start();
        
    }
}
