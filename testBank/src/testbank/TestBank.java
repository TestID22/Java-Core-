/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbank;

/**
 *
 * @author vital
 * Таск создание баланса.
 */
public class TestBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank client1 = new Bank(100.00);
        client1.putMoney(21.74);
        System.out.println("Проверка средст до зачисления ЗП");
        client1.displayBalance();
        //Зачисляем
        client1.putMoney(5000.2);
        System.err.println("Проверка после зачисления");
        client1.displayBalance();
        client1.getMonet(500);
        client1.displayBalance();
                

    }
}
