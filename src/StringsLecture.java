import java.util.Arrays;
import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
//        System.out.println("Print your name");
//        String input = scnr.next();
//        String randomName = "Grady";
//        if(input.equalsIgnoreCase(randomName)){
//            System.out.println("Hey that's my name!");


        Scanner sc = new Scanner(System.in);
        String[] studentsArr =
                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
                        "Casey", "Dorian", "Tristan", "Jordy"};

        System.out.println("Enter your name");
        int randomNum = (int) (Math.random() * 28);
        String randomName = studentsArr[randomNum];
        String input = sc.next();
        while (!input.equalsIgnoreCase(randomName)){

            randomNum = (int) (Math.random() * 28);
            randomName = studentsArr[randomNum];
            System.out.printf("%s \n", randomName);

        }




    }
}
