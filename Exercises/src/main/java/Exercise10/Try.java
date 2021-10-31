package Exercise10;

class Shape { /* ... */ }
class Circle extends Shape { /* ... */ }
class Rectangle extends Shape { /* ... */ }

class Node<T> { /* ... */ }

public class Try {
    public static void main(String[] args) {
        Node<Circle> nc = new Node<>();
       // Node<Shape>  ns = nc; --> gives error
    }
}
