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
public class SubTread extends Thread{
    
    public SubTread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        for(int i = 0; i< 10; i++)
        {
            System.out.println("Наследуемый (дочерний) " + this.getName());
        }
        
    }
    
        
    
    
    
}
