import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately " + pi + "");
        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();
        System.out.println(userInt);
    }
}
