package factor;

import java.util.ArrayList;
import java.util.List;


public class CheckIfNumberIsCompositeOrNot {
    public static void main(String args[]) {
        long fact = 1;
        if (fact <= 1)
            System.out.println("neither");
        else {
            long n = 2;
            List<Long> list = new ArrayList<>();
            LeastCommonPrimeFactor.Recursive(fact, n, list);
            if (list.size() > 1) {
                System.out.println("Composite");
            } else {
                System.out.println("prime");
            }
        }

    }


}