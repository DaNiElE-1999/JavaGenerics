package Exercise8;


import java.lang.reflect.Type;
import java.util.*;
import java.util.Collections;

public class MaxElement {

    public static <T extends Object & Comparable<? super T>>
    T max(List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        return maxElem;
    }


    public void test (){

        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);


        System.out.println("Maximal element is:" + max(ld,0, ld.size()));

    }//test method

}
