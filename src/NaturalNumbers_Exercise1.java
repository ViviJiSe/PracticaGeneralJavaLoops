import java.io.PrintStream;
import java.util.Scanner;

public class NaturalNumbers_Exercise1 {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int counter = 0;

        while (counter <= 10) {
            out.println(counter);
            counter++;

        }
    }
}
