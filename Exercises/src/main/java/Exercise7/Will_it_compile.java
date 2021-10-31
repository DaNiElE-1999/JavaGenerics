package Exercise7;

import java.util.*;

public class Will_it_compile {

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }//it will compile

    public static void main(String[] args) {
        List<Number> l = new ArrayList<>();

        l.add(1);
        l.add(2);
        l.add(0.1);

        print(l);

    }

}
