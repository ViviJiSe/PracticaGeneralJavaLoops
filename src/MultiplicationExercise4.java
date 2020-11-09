import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicationExercise4 {

    private static Scanner scanner = new Scanner(System.in);

    public static String numToMultiply(int num){
        String result = "";
        for (int counter = 1; counter <=10; ++counter){
            result += (num*counter) + "\n";
        }
        return result;
    }

    public static int numReqFromUser(String message){
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println(numToMultiply(numReqFromUser("Type a number to multiply: ")));
    }
}
