import java.util.Locale;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);
//        System.out.printf("The value of pi is approximately " + pi + "");

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int userInt = scanner.nextInt();
//        System.out.println(userInt);

//        System.out.println("Enter three lines:");
//        String line1 = scanner.next();
//        String line2 = scanner.next();
//        String line3 = scanner.next();
//        System.out.printf("%s\n%s\n%s\n", line1, line2, line3);

//        System.out.println("enter: Hello World");
//        String sequence = scanner.nextLine();
//        if (sequence.toUpperCase(Locale.ROOT).equals("HELLO WORLD")){
//            System.out.println("Gang");
//        } else {
//            System.out.println("LAME");
//        }


        System.out.println("RECTANGLE P/A:");
        System.out.println("ENTER LENGTH");

        String length = scanner.next();
//        double length = scanner.nextDouble();

        System.out.println("ENTER WIDTH");

//        double width = scanner.nextDouble();
        String width = scanner.next();

//        double perimeter = (length *  2) + (width * 2);
        int perimeter = (Integer.parseInt(length) * 2) + (Integer.parseInt(width) * 2);
        int area = (Integer.parseInt(length)) * (Integer.parseInt(width));
//        double area = (length * width);

        System.out.println("PERIMETER: " + perimeter);
        System.out.println("AREA: " + area);

//        System.out.printf("PERIMETER: %.2f units \n", perimeter);
//        System.out.printf("AREA: %.2f units", area);


    }
}
