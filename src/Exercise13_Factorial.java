import java.util.Scanner;

public class Exercise13_Factorial {

    private static Scanner scanner = new Scanner(System.in);

    public static int numReqFromUser(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static int factorialOfANumber(int numReqFromUser){
        int factorial=1;
        for (int counter=1; counter <= numReqFromUser; ++counter){
            factorial *=counter;

        }
            return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorialOfANumber(numReqFromUser("Type a number to find its factorial: ")));
    }

}
