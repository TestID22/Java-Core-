import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //Определяем логику лямбды.
        Numeric IsPositive = (n, m) -> (n + m) > 0;
        //доступ к методу через точку, как у простого объекта.
        boolean test = IsPositive.test(10, 10);

        System.out.println("Введите первое число");
        int firstNumber = in.nextInt();
        System.out.println("Введите воторое число");
        int secondNumber = in.nextInt();

        if(firstNumber + secondNumber == 0)
            System.out.println("0");
        else if(!IsPositive.test(firstNumber, secondNumber)){
            System.out.println("Число маскимально не позитивное");
        }else
            System.out.println("Позитивненько");
        //Проверка суммы двух больше 100.
        Numeric bigerThanHund = (n, m) -> (n + m) > 100;
        if(bigerThanHund.test(firstNumber,secondNumber)){
            System.out.println("Изменили Логику Лямбды, и да число больше чем 100");
        }
        System.out.println(bigerThanHund.test(firstNumber,secondNumber));
        //Проверка на чётность
        NumericWithOneArgument IsEven = n -> n % 2 == 0;
        System.out.println("Введите число, а я проверю его на чётность");
        int thirdNumber = in.nextInt();
        if(IsEven.test(thirdNumber)){
            System.out.println("Число чётное");
        }

    }

}
