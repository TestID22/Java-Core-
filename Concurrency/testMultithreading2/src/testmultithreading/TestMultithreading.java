
package testmultithreading;


/**
 *
 * @author vitalii22
 * Есть 2 способа создать поток 
 * 1.Расширить класс Thread - но тогда, мы не сможем наследовать от другого 
 * класса
 * 2.Имплеменитровать (реализовать) Runnable
 */
public class TestMultithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //создание потока из наследования
        new SubTread("extends");
        //создание потока из имплементации
        new RunThread();
        
        //Создание простого(Главного) потока
       new Thread();
        try {
            for (int i = 0; i < 10; i++)
            {
            System.out.println("Главный поток");
            Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
