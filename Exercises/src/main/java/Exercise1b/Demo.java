package Exercise1b;

import Exercise1.OddIntegers;

public class Demo {

    public static <U> void addPrimeNumbers(U u,
                                           java.util.ArrayList<PrimeNumbers<U>> prime){

        PrimeNumbers<U> p = new PrimeNumbers<>();
        p.set(u);
        prime.add(p);
    }

    public static <U> void getPrimeNumbers(java.util.ArrayList<PrimeNumbers<U>> prime){

        int counter = 0;

        for(PrimeNumbers<U> p: prime){
            U primeContents = p.get();
            boolean check = primeCheck(primeContents);
            if(check == true){
                counter ++;
            }
        }

        System.out.println("There are " + counter + " prime numbers");
    }

    public static <U> boolean primeCheck (U u){

        int i,m=0,flag=0;
        int n = (int) u;

        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
            return false;
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    return false;

                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
            return true;
        }//end of else

    }

    public static void main (String[] args){

        java.util.ArrayList<PrimeNumbers<Integer>> listOfPrimeNumbers =
                new java.util.ArrayList<>();
        Demo.addPrimeNumbers(Integer.valueOf(1), listOfPrimeNumbers);
        Demo.addPrimeNumbers(Integer.valueOf(2), listOfPrimeNumbers);
        Demo.addPrimeNumbers(Integer.valueOf(3), listOfPrimeNumbers);
        Demo.addPrimeNumbers(Integer.valueOf(4), listOfPrimeNumbers);
        Demo.addPrimeNumbers(Integer.valueOf(5), listOfPrimeNumbers);
        Demo.addPrimeNumbers(Integer.valueOf(6), listOfPrimeNumbers);

        Demo.getPrimeNumbers(listOfPrimeNumbers);
    }//main
}
