public class Exercise12_FibonacciSeries {

    public static void main(String[] args) {
        int terms = 10;
        int previousTerm = 0;
        int termBeforePrevious = 1;
        int termNumber;

        System.out.println("Fibonacci sequence:");

        for (int counter = 1; counter <= terms; ++counter) {
            System.out.print(previousTerm + " ");
            termNumber = previousTerm + termBeforePrevious;
            previousTerm = termBeforePrevious;
            termBeforePrevious = termNumber;
        }
    }
}
