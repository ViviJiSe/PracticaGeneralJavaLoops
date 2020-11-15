public class Exercise01_NaturalNumbers {

    public static void main(String[] args) {

        int counter = 0;
        System.out.println(counterLoop(counter));
    }

    public static String counterLoop(int counter){
        String num="";
        while (counter <= 10) {
           num += counter + "\n";
            ++counter;
        }
        return num;
    }

}
