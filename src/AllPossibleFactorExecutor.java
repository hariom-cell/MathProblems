import java.util.*;


public class AllPossibleFactorExecutor {
    public static void main(String args[]) {
        long fact = 1200;
        long n = 2;
        List<Long> list = new ArrayList<>();
        LeastCommonFactor.Recursive(fact, n, list);
        Set<List<Long>> set = new HashSet<>();
        set.add(list);
       AllPossibleFactors.possiblePair(list, set);

      set.forEach(System.out::println);
    }


}