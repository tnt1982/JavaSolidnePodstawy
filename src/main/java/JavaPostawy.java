import java.util.Random;
import java.util.Scanner;

public class JavaPostawy {

    public static void main(String[] args) {

        int end = 7;
        printSomeNumbers(end);
    }

    public static void printSomeNumbers(int end) {
        Random r = new Random();
        int begin = r.nextInt(end);
        for (int i = begin; i <= end; i++) {
            if (i == begin) {
                System.out.print(i);
            } else {
                System.out.print("," + i);
            }
        }
    }
}
