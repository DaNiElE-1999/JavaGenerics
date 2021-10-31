package Exercise11;

class Node<T> implements Comparable<T> {
    public int compareTo(T obj) { /* ... */
        return 1;
    }
    // ...

}

//it will compile

public class Try {
    public static void main(String[] args) {
        Node<String> node = new Node<>();
        Comparable<String> comp = node;
    }
}
