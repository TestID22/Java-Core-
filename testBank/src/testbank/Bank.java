/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbank;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author vital
 */
public class Bank {
    private double balance;
    
 
    public Bank(double openBalance) {
        balance = openBalance;
    }
    
    public void putMoney(double deposit){
        balance += deposit;
    }
    
    public void getMonet(double money){
        balance -= money;
        if (balance < 0)
            System.err.println("Недостаточно средств на счету");
    }
    public void displayBalance(){
        System.err.println("Ваш Баланс: " + balance);
    }
    
}
