import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class E_525f50e3b73515a6db000b83 {
    public static class Kata {
        public static String createPhoneNumber(int[] numbers) {
            Queue<String> queue = new LinkedList<String>();

            return Arrays
                .stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())
                .replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
        }


    }

    public static void main(String[] args) {
        System.out.println(Kata.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
