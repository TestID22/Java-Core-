import javafx.scene.shape.Path;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class CoreJava3_2 {
    public static void main(String[] args) throws IOException {
        int a = 30;
        PrintStream printf = System.out.printf("Вам %d лет\n", a);// prinf С функция потока вывода
        Scanner in = new Scanner(Paths.get("d:\\Projects\\Java\\Core_Java_3-2\\src\\myfile.txt"), "UTF-8");
        PrintWriter out = new PrintWriter("MyFile.txt");
        out.printf("Всякое пишу");
        Scanner input = new Scanner(System.in);
        String answer = input.next();

        System.out.printf("\n %s", answer);




        array_func(); //своя фунуция, она ниже...


        }



        static void array_func() {
            int[] testaaray = new int[100];

            for (int i = 0; i < testaaray.length; i++){
                testaaray[i] = i;
                System.out.println(testaaray[i]);

            }
            //Типичный цикл for как в Питоне
                for (int i:testaaray){
                System.out.println("Квадрат " + (i * i));
            }
        }

    }

