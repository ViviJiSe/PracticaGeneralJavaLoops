import java.io.PrintStream;
import java.util.Scanner;

public class Pattern2Exercise7 {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int row;
        int column;
        int size = 5;
        int num;

        for (row = size; row>=1; --row) {

            num=5;

            for (column = row; column >= 1; --column) {
                System.out.print(column + " ");

            }
            System.out.println();
        }
    }
}


