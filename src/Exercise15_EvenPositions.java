public class Exercise15_EvenPositions {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int position =1; position<= numbers.length; position=position+2) {
            System.out.print(numbers[position]+" ");
        }
    }
}
