import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class E_5547cc7dcad755e480000004 {

    public static class RemovedNumbers {

        public static List<long[]> removNb(long n) {
            if (n < 0) return List.of();

            final List<Long> sequence = createSequence(n);
            final long sum = (n * n + n) / 2;
            List<long[]> validTuples = new ArrayList<>();

            for (int i = 0; i < sequence.size() - 1; i++) {
                for (int j = i + 1; j < sequence.size(); j++) {

                    if ((sequenceSumMinusNumbers(sum, sequence, i, j) == multiplyTuple(sequence, i, j))) {
                        validTuples.add(new long[]{sequence.get(i), sequence.get(j)});
                        break;
                    }
                }
            }
            return validTuples;
        }

        private static long multiplyTuple(List<Long> sequence, int i, int j) {
//            return sequence.get(i) * sequence.get(j);
            return (long) (i + 1) * (j + 1);
        }

        private static long sequenceSumMinusNumbers(long sum, List<Long> sequence, int i, int j) {
            return sum - sequence.get(i) - sequence.get(j);
        }

        private static List<Long> createSequence(long n) {
            return LongStream.rangeClosed(1, n)
                .boxed()
                .toList();
        }
    }

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        System.out.println(RemovedNumbers.removNb(200000).stream().map(Arrays::toString).collect(Collectors.joining()));

        System.out.printf("Code runned in %s milliseconds%n", System.currentTimeMillis() - startTime);
    }
}
