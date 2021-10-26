package MultiTypeParameters;

//import

public class Test {
    public static void main (String[] args){
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");

        OrderedPair<String, Integer> pA1 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String>  pA2 = new OrderedPair<>("hello", "world");

    }

}
