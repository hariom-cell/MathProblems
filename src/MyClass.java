import java.util.*;
import java.util.stream.Collectors;



public class MyClass {

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


    private static void possiblePair(final List<Long> factors
            , Set<List<Long>> set) {
        int index=0;
//        if (factors.isEmpty()) {
//            return ;
//        }
        for (int j = 0; j < factors.size(); j++) {
            for (int i = 0; i < factors.size(); i++) {
                List<Long> copy = new ArrayList<>();
                copy.addAll(factors);
                if (i == index) {
                    continue;
                } else {
                    long finalResult = copy.get(index) * copy.get(i);
                    copy.set(i, finalResult);
                    copy.remove(index);
                    Collections.sort(copy);
                    set.add(copy);
                    possiblePair(copy, set);

                }
            }
            index++;

        }
    }


    public static void main(String args[]) {
        long fact = 1200;
        long n = 2;
        List<Long> list = new ArrayList<>();
        MyClass.Recursive(fact, n, list);
        Set<List<Long>> set = new HashSet<>();
        set.add(list);
       MyClass.possiblePair(list, set);

      set.forEach(System.out::println);
    }


}