/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmultithreading;

/**
 *
 * @author vital
 */
public class RunThread implements Runnable{
    Thread t;
    public RunThread() {
        t = new Thread(this, "implements");
        t.start();
    }

    @Override
    public void run() {
            for(int i = 0; i < 10; i++)
            System.out.println("Реализующий (дочерний)"  + t.getName()); 
        
    }  
}
