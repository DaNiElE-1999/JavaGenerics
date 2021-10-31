package Exercise12;

import java.util.*;

public final class Algorithm {

    public static <T>
    int findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p) {

        for (; begin < end; ++begin)
            if (p.test(list.get(begin)))
                return begin;
        return -1;
    }// method  finds the first integer in a
    // list that is relatively prime to a list of specified integers

    // x > 0 and y > 0
    public static int gcd(int x, int y) {
        for (int r; (r = x % y) != 0; x = y, y = r) { }
        return y;
    }// method returns greatest common divisor
}