import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindMinFromList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(20);
        Random getRandomNumbers = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(i, getRandomNumbers.nextInt(40) - 20);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " element list = " + numbers.get(i));
        }
        System.out.println();
        System.out.println("Minimal number from List = " + findMinNumb(numbers));

    }

    public static int findMinNumb(List<Integer> numbers) {
        int min = numbers.get(0);
        for (Integer number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }
}