package factor;

import java.util.ArrayList;
import java.util.List;


public class CommonDivisiblity {
    final static long n = 2;
    public static void main(String args[]) {
        long firstFact = 9;
        List<Long> FirstFactor = new ArrayList<>();
        LeastCommonPrimeFactor.Recursive(firstFact, n, FirstFactor);
        long secondFact = 24;
        List<Long> secondFactor = new ArrayList<>();
        LeastCommonPrimeFactor.Recursive(secondFact, n, secondFactor);
        FirstFactor.stream().forEach(aLong -> {
            if(!secondFactor.contains(aLong)){
                secondFactor.add(aLong);
            }
        });

        System.out.println(secondFactor);
    }

}