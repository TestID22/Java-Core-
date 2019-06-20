import java.util.*;
import com.september.sportcar.*;

public class StringBuilder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введит корыто на котором ты летишь");
        String carName = in.next();
        int carSpeed = in.nextInt();
        if (carSpeed > 100) {
            System.out.println("Вы что? Ваша машина чуть круче корыта, она столько не поедет");
            carSpeed = 20;
        } else if (carSpeed < 100) {
            System.out.println("Ясно, вы на роликах");
            carSpeed = 300;
        } else
            carSpeed = 100;

        Mitsubishi car = new Mitsubishi(180, carName, true);

        System.out.println("Ты летишь на " + car.getName() + 'e');
        if (carName.equals("зепер")) {
            System.out.println("Вы Царь! и ваша скорость - " + carSpeed);

        }
        System.out.println("ОГо вот это скорость аж " + carSpeed);
        System.out.println("1- Характеристики авто");
        int choose = in.nextInt();
        switch (choose) {
            case (1):
                System.out.println("Машина "  + carName + "\n");
                System.out.println("Скорость "  + carSpeed + "\n");
                System.out.println("Нитруха "  + car.getNos() + "\n");




            }
        }
        }



