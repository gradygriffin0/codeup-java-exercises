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


//        Scanner sc = new Scanner(System.in);
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//
//        System.out.println("Enter your name");
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];
//        String input = sc.next();
//        while (!input.equalsIgnoreCase(randomName)){
//
//            randomNum = (int) (Math.random() * 28);
//            randomName = studentsArr[randomNum];
//            System.out.printf("%s \n", randomName);
//
//        }
        //        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"
        String sentence = "Red Orange Blue Yellow Green Purple";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a color");
        String input = sc.next();
        if (sentence.toUpperCase().startsWith(input.toUpperCase())){
            System.out.println("your favorite color is the start of sentence");
        }
        if (sentence.toUpperCase().endsWith(input.toUpperCase())){
            System.out.println("your favorite color is the end of sentence");
        }




    }
}
