
public class Exercise02_Pattern {

    public static void main(String[] args) {
        int row;
        int column;
        int size = 5;
        int num;

        for (row = 0; row < size; ++row) {

            num = 1;
            for (column = 0; column <= row; ++column) {
                System.out.print(num + " ");
                ++num;
            }
            System.out.println();
        }
    }
}
