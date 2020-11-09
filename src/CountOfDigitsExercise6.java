import java.util.Scanner;

public class CountOfDigitsExercise6 {

    private static Scanner scanner = new Scanner(System.in);

    public static int counterOfDigits(int num) {
        int counter = 0;

        while (num != 0) {
            num = num / 10;
            ++counter;
        }
        return counter;
    }

    public static int numReqFromUser(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println(counterOfDigits(numReqFromUser("Type a number to count its digits: ")));
    }
}
