import com.septemberEatMe.*;
import java.util.Scanner;
/*
@autor September - Vitalii Sabadash
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа для подсчёта площади");
        System.out.println("Введите ширину");
        double weight = in.nextDouble();
        System.out.println("Введите высоту");
        double height = in.nextDouble();

        Test ob;
        ob = new Test(weight, height);
        System.out.print("Площадь равна = " + ob.getArea());
    }
}
