import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {

        Set <String> words = new HashSet<>();
        Scanner in = new Scanner(System.in);
        long totalTime = 0;
        while (in.hasNext())
        {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }
        Iterator<String> iter = words.iterator();
        for (int i = 1;i <=20; i++)
            System.out.println(iter.next());

    }
}

