package Generics;

//import

public class Test {
    public static void main (String[] args){
        BoxGenericClass<Integer> integerBox = new BoxGenericClass<Integer>();

        //Raw types show up in legacy code because lots of API classes (such as the Collections classes)
        // were not generic prior to JDK 5.0. When using raw types,
        // you essentially get pre-generics behavior — a Box gives you Objects.
        // For backward compatibility, assigning a parameterized type to its raw type is allowed:

        //BoxGenericClass<String> stringBox = new BoxGenericClass<>();
        //BoxGenericClass rawBox = stringBox;               // OK
    }

}
