package Exercise1;

public class Main {

    public static <U> void addInteger(U u,
                                      java.util.List<OddIntegers<U>> oddInt){
        OddIntegers<U> odd = new OddIntegers<>();
        odd.set(u);
        oddInt.add(odd);

    }

    public static <U> void outputOddInteger(java.util.List<OddIntegers<U>> oddInt){
        int count = 0;

        for(OddIntegers<U> odd : oddInt){
            U OddContents = odd.get();
            boolean check = OddCheck(OddContents);
            if(check == true){
                count ++;
            }
        }

        System.out.println("There are " + count + " odd numbers");

    }

    public static <U> boolean OddCheck (U u){
        int num = (int) u;
        if (num%2 == 0){
            System.out.println("Odd");
            return true;
        }
        else{
            System.out.println("Even");
            return false;
        }
    }

    public static void main (String[] args){

        java.util.ArrayList<OddIntegers<Integer>> listOfOddInteger =
                new java.util.ArrayList<>();

        Main.addInteger(Integer.valueOf(10), listOfOddInteger);
        Main.addInteger(Integer.valueOf(11), listOfOddInteger);
        Main.addInteger(Integer.valueOf(12), listOfOddInteger);
        Main.addInteger(Integer.valueOf(13), listOfOddInteger);
        Main.outputOddInteger(listOfOddInteger);
    }
}
