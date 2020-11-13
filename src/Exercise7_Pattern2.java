import java.io.PrintStream;
import java.util.Scanner;

public class Exercise7_Pattern2 {

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


