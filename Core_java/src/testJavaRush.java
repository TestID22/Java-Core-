import java.io.IOException;
import java.util.Scanner;

public class testJavaRush {
    private static String text = "Hey, Kids!";
    public static void main(String[] args) throws  Exception{
        System.out.println(text);
        String EasySanta = "YO - HO - HO";

        printTextMoreTimes(EasySanta, 3);
    }
    public static void printTextMoreTimes(String s, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }
}
