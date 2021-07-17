package warmup;

import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(primeNumbers());
    }
    public static ArrayList<Integer> primeNumbers(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++){
            for (int j = 2; j <= 20; j++) {
                System.out.println(j);
                System.out.println(i);
                if (i % j == 0){
                    System.out.println(i + " is not a prime number");
                    numbers.add(i);
                    break;
                }
            }
        }
        return numbers;
    }
}
