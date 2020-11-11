public class ReverseArrayExercise8 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int arrayIndex =numbers.length-1; arrayIndex>=0; --arrayIndex){
            System.out.println(numbers[arrayIndex]);
        }
    }
}
