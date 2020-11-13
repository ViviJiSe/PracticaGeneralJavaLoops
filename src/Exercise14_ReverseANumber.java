import java.util.Scanner;

public class Exercise14_ReverseANumber {

    private static Scanner scanner = new Scanner(System.in);

    public static int numReqFromUser(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static int reverseNumber(int num) {
        int reverse;
        for (reverse=0; num !=0; num = num / 10) {
            int reminder = num % 10;
            reverse = reverse*10 + reminder;
        }
        return reverse;
    }


    public static void main(String[] args) {
        System.out.println(reverseNumber(numReqFromUser("Type a number to reverse: ")));

    }
}
