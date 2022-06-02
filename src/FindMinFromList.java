import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindMinFromList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(20);
        Random getRandomNumbers = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(i, getRandomNumbers.nextInt(50) - 10);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(numbers.get(i));
        }
    }
}