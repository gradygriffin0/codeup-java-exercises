package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static HashMap<String, Student> students = new HashMap<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        createStudents();

        home();

    }
    public static void createStudents(){
        Student student1 = new Student("Grady");
        student1.addGrade(100);
        student1.addGrade(95);
        student1.addGrade(90);
        Student student2 = new Student("James");
        student2.addGrade(80);
        student2.addGrade(90);
        student2.addGrade(75);
        Student student3 = new Student("Lyle");
        student3.addGrade(65);
        student3.addGrade(50);
        student3.addGrade(85);
        Student student4 = new Student("Leeroy");
        student4.addGrade(95);
        student4.addGrade(80);
        student4.addGrade(100);


        students.put("gradygriffin0", student1);
        students.put("jamesjameson123", student2);
        students.put("lylekyle", student3);
        students.put("leeroyjenkins", student4);
    }

    public static void homeMessage() {
        System.out.println("Welcome.");
        System.out.println("Here is a list of current students:\n");
        for (String username : students.keySet()) {
            System.out.printf(" |%s| ", username);
        }
        System.out.println("\n\nOptions:");
        System.out.println("0 - Exit");
        System.out.println("1 - View all grades.");
        System.out.println("2 - View Specific Students");
        System.out.print("> ");

    }
    public static void showAllGrades(){
        for(Student student : students.values()){
            System.out.printf("\nStudent: " + student.getName() + "\nGrades: " + student.getGrades() + "\nAverage: %.2f\n", student.getGradeAverage());

        }
    }
    public static void chooseOption(){
        String choice = sc.next();
        if (choice.equalsIgnoreCase("0")){
            return;
        }
        if(choice.equalsIgnoreCase("1")){
            showAllGrades();
        }
        if(choice.equalsIgnoreCase("2")){
            displayStudent(chooseStudent());
        }


    }

    public static String chooseStudent() {
        System.out.println("What student would you like to see more information on?");
        System.out.print(">");
        String userInput = sc.next();
        for (String username : students.keySet()) {
            if (userInput.equalsIgnoreCase(username)) {
                return username;
            }

        }
        System.out.println("Couldn't find username. Try again.");
        return chooseStudent();
    }
    public static void displayStudent(String student){

        Student thisStudent = students.get(student);
        System.out.printf("Name: %s \nGithub Username: %s \nCurrent Average: %.2f \nList Of Grades: %s\n", thisStudent.getName(), student, thisStudent.getGradeAverage(), thisStudent.getGrades());
    }

    public static boolean continueCheck(){
        System.out.println("\nWould you like to continue?");
        System.out.printf("Enter y or n: ");
        String input = sc.next();
            if (input.equalsIgnoreCase("y")){
                return true;
            }
            else if (input.equalsIgnoreCase("n")){
                System.out.println("\nGoodbye.");
                return false;

            } else {
                System.out.println("Not y or n, try again:");
                return continueCheck();
            }
    }

    public static void home() {

        homeMessage();

        chooseOption();


        if(continueCheck()){
            home();
        }

    }
}
