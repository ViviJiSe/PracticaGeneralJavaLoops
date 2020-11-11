import jdk.nashorn.internal.ir.CallNode;
import java.lang.Math;

public class Exercise11_PrimeNumbersWithinRange {

    public static boolean primeNum(int start) {
        int counter = 2;
        boolean isPrime = true;
        double squareRoot = Math.sqrt(start);

        while (counter <= squareRoot) {
            if (start % counter == 0) {
                isPrime = false;
            }
            ++counter;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int start = 25;
        int end = 50;

        System.out.println("Prime numbers between " + start + " and " + end + " are:" );

        for (int validation=start; validation<=end; ++validation){
            if (primeNum(validation)==true){
                System.out.println(validation);
            }
        }


    }


}

