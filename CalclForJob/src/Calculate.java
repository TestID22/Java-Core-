import javax.print.CancelablePrintJob;
import java.util.Scanner;

public class Calculate implements Runnable{

    Thread thread;
    private boolean running = false;

    Scanner input = new Scanner(System.in);
    String numbers;
    String [] arrayN;

    private int firstNumber;
    private int secondNumber;
    char plus = '+';

    public Calculate() {

    }

    //Done стартуем поток
    public void startApp() {
        running = true;
        thread = new Thread(this, "Calculate");
        thread.start();
    }

    //done
    public void stopApp() {
        try {
            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //TO DO:
    public void parseIntergers(String numbers){
        arrayN = numbers.split(" ");
        firstNumber = (int)Integer.parseInt(arrayN[0]);
        secondNumber = (int)Integer.parseInt(arrayN[2]);
        }

    public String parseOperatoes(String numbers){
        arrayN = numbers.split(" ");
        return arrayN[1];
    }


    //Logic Here
    @Override
    public void run() {
        System.out.println("Я каклькулятор на Максималках");
        System.out.println("Введите два чилса через ПРОБЕЛ это важно, Керниган так учил");
        try {
            numbers = input.nextLine();
            parseIntergers(numbers);
            System.out.println("Первое число :" + firstNumber +
                                "\nВторое число :" + secondNumber +
                                "\nОператор :" + parseOperatoes(numbers));




        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

