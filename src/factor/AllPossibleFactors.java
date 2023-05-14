package factor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class AllPossibleFactors {
    static void possiblePair(final List<Long> factors
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

}
