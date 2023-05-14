package factor;

import java.util.ArrayList;
import java.util.List;


public class AllPossiblePrimeFactorExecutor {
    public static void main(String args[]) {
        long fact = 120;
        long n = 2;
        List<Long> list = new ArrayList<>();
        LeastCommonPrimeFactor.Recursive(fact, n, list);
        System.out.println(list);

    }


}