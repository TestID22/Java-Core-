import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку, а я её переверну");
        String reverse = in.nextLine();

        int i,j;

        for (i = 0, j = reverse.length()-1; 0 <= j; i++, j--){ //криво, зато сам.
            char temp = reverse.charAt(i);
            temp = reverse.charAt(j);

            System.out.print(temp);
        }
    }
}
