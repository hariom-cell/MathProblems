package factor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CommonDivisiblityDynamic {
    final static long n = 2;

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        List<Long> FinalFactor = new ArrayList<>();

        long x = 0;
        while ((x = scanner.nextLong()) > 1) {
            List<Long> FirstFactor = new ArrayList<>();
            LeastCommonPrimeFactor.Recursive(x, n, FirstFactor);
            FirstFactor.stream().forEach(aLong -> {
                if (!FinalFactor.contains(aLong)) {
                    FinalFactor.add(aLong);
                }
            });
        }


        System.out.println(FinalFactor);
    }

}