import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);
        Scanner sc = new Scanner(System.in);
        System.out.println(HighLow(randomNumber, sc));
    }
    public static String HighLow(int randomNumber, Scanner scanner){
        System.out.println((10 - counter.count) + " Tries Remain.");
        if (counter.count == 10){
            System.out.println("You lose! No tries remain.");
            return "L";
        }

        int guess = guess(scanner);

        if (guess > randomNumber){
            System.out.println("LOWER");
            return HighLow(randomNumber, scanner);
        }
        else if (guess < randomNumber){
            System.out.println("HIGHER");
            return HighLow(randomNumber, scanner);
        }
        else if (guess == randomNumber){
            return ("Good Guess! It took you " + counter.count + " tries.");
        }



        return " end";
    }
    public static class counter{
        public static int count;
    }
    public static int guess(Scanner scanner){
        System.out.println("Guess the number between 0 and 100:");
        int guess = 0;
        while(!scanner.hasNextInt()) {
            if (scanner.hasNextInt()) {
                 guess = scanner.nextInt();
                 break;
            }
        }
        if (guess < 0 || guess > 100){
            System.out.println("Number not between 0 and 100");
            return guess(scanner);
        }
        else {
            counter.count++;
            return guess;
        }
    }

}
