import java.util.Scanner;

public class Exercise05_Array {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] number = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        System.out.println(divisionByFive((number)));
    }

    public static String divisionByFive(int[] num) {
        String result = "";
        for (int position = 0; position < num.length; ++position) {

            if (num[position] % 5 == 0 && num[position] <= 150) {
                result += (num[position]) + "\n";
            }

        }
        return result;
    }
}
