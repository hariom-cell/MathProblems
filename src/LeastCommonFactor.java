import java.util.List;

public class LeastCommonFactor {


    public static boolean isPrimeNumber(long number) {
        long root = (long) Math.sqrt(number);
        for (long i = 2; i <= root; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Recursive(long fact, long n, List<Long> list) {
        if (fact == 1) return;

        if (fact % n != 0) {
            if (isPrimeNumber(fact)) {
                Recursive(fact, fact, list);
            } else {
                Recursive(fact, ++n, list);
            }
        } else {
            long result = fact / n;
            list.add(n);
            Recursive(result, n, list);
        }
    }

}
