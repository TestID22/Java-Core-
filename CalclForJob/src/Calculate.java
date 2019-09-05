import javax.print.CancelablePrintJob;
import java.util.Scanner;

public class Calculate implements Runnable{

    private static int firstNumber;
    private static int secondNumber = 1;
    //парсим ввод, массив нужен для проверки ввода кол-во символов
    char [] parse;
    //строка ввода, нужна для отделения чисел
    private String numbers;
    //операции
    Operations operators = new Operations(firstNumber, secondNumber);
    //поток и рантайм
    private Thread thread;
    private static boolean running = false;
    //поток ввода
    private Scanner input = new Scanner(System.in);


    int result = 0;

    char whiteSpace = ' ';
    char plus = '+';
    char minus = '-';
    char divide = '/';
    char multy = '*';

    public Calculate() {

    }
    //Done стартуем поток
    public void startApp() {
        running = true;
        thread = new Thread(this, "Calculate");
        thread.start();
    }
    //done
    public void stopApp(){
        try {
            thread.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    /////////////////////////////Проверки/////////////////////////////////////////
    //проверка на ввод //done
    public boolean isNumberGood(int number){
        if(number > 1 || number < 10)
            firstNumber = number;
        else
            return false;
        return true;
    }
    //если длинна ввода больше 5 символов, то роняем рантайм DONE
    public boolean lenghtCalc(char[] parse) throws Exception{
        if(parse.length > 5)
            return false;
        return true;
    }

    //посимвольный анализ не работает Керниган И Ритчи ПОМОГИИИИТЕЕ!!!TO DO: Распарсить массив на числа
    public void parseForFirstNum(String number){
        String [] arrNumbers = number.split(" ");
        for(String s : arrNumbers)
            System.out.print(s);
    }


    public void pasreOperator(char operator) throws Exception {
            switch (operator){
                case('+'):
                    System.out.println(operators.plus(firstNumber,secondNumber));
                    break;
                case('-'):
                    System.out.println(operators.minus(firstNumber,secondNumber));
                    break;
                case ('/'):
                    System.out.println(operators.divide(firstNumber,secondNumber));
                    break;
                case ('*'):
                    System.out.println(operators.multy(firstNumber,secondNumber));
                    break;
                    default:
                        throw new BadNumExeption("Оператор введён неверно",0);
            }

        }


    //Logic Here
    @Override
    public void run() {
        System.out.println("Я каклькулятор на Максималках");
        System.out.println("Введите два чилса через ПРОБЕЛ это важно, Керниган так учил");
        try {
            numbers = input.next();
            parse = numbers.toCharArray();
            String [] arrN = numbers.split(" ", 3);
            if (lenghtCalc(parse)) {
                for(String s: arrN)
                    System.out.println(s);
            } else
                throw new BadNumExeption("Введено плохое число", firstNumber);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

