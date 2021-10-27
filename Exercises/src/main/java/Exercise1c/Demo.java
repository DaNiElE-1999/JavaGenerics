package Exercise1c;

import Exercise1b.PrimeNumbers;

public class Demo {

    public static <U> void addPalindrome(U u,
                                           java.util.ArrayList<Palindrome<U>> type){

        Palindrome<U> p = new Palindrome<>();
        p.set(u);
        type.add(p);
    }

    public static <U> void printPalindrome(java.util.ArrayList<Palindrome<U>> type){

        int counter = 0;

        for(Palindrome<U> p: type){
            U primeContents = p.get();
            boolean check = palindromeCheck(primeContents);
            if(check == true){
                counter ++;
            }
        }

        System.out.println("There are " + counter + " palindromes");

    }

    public static <U> boolean palindromeCheck (U u){

        // Pointers pointing to the beginning
        // and the end of the string
        String str = u.toString();
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;

    }

    public static void main (String[] args){

        java.util.ArrayList<Palindrome<Integer>> listOfPalindrome =
                new java.util.ArrayList<>();
        java.util.ArrayList<Palindrome<String>> listOfPalindromeString =
                new java.util.ArrayList<>();

        Demo.addPalindrome(Integer.valueOf(1881), listOfPalindrome);
        Demo.addPalindrome(Integer.valueOf(1882), listOfPalindrome);
        Demo.addPalindrome(Integer.valueOf(1991), listOfPalindrome);
        Demo.addPalindrome(Integer.valueOf(2002), listOfPalindrome);
        Demo.addPalindrome(String.valueOf(false), listOfPalindromeString);
        Demo.addPalindrome("aaaa", listOfPalindromeString);

        Demo.printPalindrome(listOfPalindrome);
        Demo.printPalindrome(listOfPalindromeString);

    }//main
}
