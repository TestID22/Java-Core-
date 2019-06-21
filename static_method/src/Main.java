import com.september.*;
import static com.september.StaticTest.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(pazaInterAmala); //статичное поле, это поле класса, а не объекта - это поле хранится в каждом
        //объекте класса
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя, а затем фамилию");
        String name = in.next();
        String sname = in.next();
        StaticTest.fullName(name, sname); // Статичный метод, управляет не объектом,
                                        //чтоб вызвать статичный метод, не нужно создавать объект


        StaticTest one = new StaticTest();
        StaticTest two = new StaticTest();
        StaticTest three = new StaticTest();
        two.getId();
        three.getId();

    }
}
