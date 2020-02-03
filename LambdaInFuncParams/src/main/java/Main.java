import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String someString = in.nextLine(); //строка над которой буду издеваться.

        //Логику можно создавать и просто в переменной Функционального интерфейса.
        SomeFunction reverse = (str) -> {
            String reverseString = "";
            for(int i = someString.length() - 1; i > 0; i--){
                reverseString += someString.charAt(i);
            }
            return reverseString;
        };


        //Логику лямбды можно писать прямо в параметрах.
        String upString = someMethod((str) -> str.toUpperCase(), someString);

        System.out.println(upString);
        System.out.println(someMethod(reverse, someString));

    }

    //Создаём метод, в параметрах определяем Функциональный интерфейс.
    static String someMethod(SomeFunction sfIntrface, String s){
        return  sfIntrface.func(s);
    }
}

