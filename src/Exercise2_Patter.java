import java.io.PrintStream;
import java.util.Scanner;

public class Exercise2_Patter {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int row;
        int column;
        int size = 5;
        int num;

        for (row = 0; row < size; row++) {

            num = 1;
            for (column = 0; column <= row; column++) {
                out.print(num + " ");
                num++;
            }
            out.println();
        }
    }
}
