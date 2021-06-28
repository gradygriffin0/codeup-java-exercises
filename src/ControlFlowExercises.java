import java.util.Scanner;

public class ControlFlowExercises  {
    public static void main(String[] args) {


//        #1
//    int i = 5;
//    while((i <= 15)){
//        System.out.print(i + " ");
//        i++;
//    }

//        2
//        int count = 0;
//        do {
//            count += 2;
//            System.out.println(count);
//        }while (count < 100);
//    }

//    int count = 100;
//        do {
//        count -= 5;
//        System.out.println(count);
//    }while (count > -10);
//        int count = 2;
//        do {
//            count = (int) Math.pow((count), 2);
//            System.out.println(count);
//        } while(count < 65536);
//        for(int i = 0; i < 100; i++){
//            System.out.println(i);
//            if(((i % 3 == 0) && (i % 5 == 0))){
//                System.out.println("FIZZBUZZ");
//            }
//            else if (i % 3 == 0){
//                System.out.println("fizz");
//            }
//            else if (i % 5 == 0){
//
//                System.out.println("buzz");
//            }

//        3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a starting integer");
//        int input = sc.nextInt();
//        System.out.println("What integer would you like to go up to?");
//        int max = sc.nextInt();
//        System.out.println("Number | Squared | Cubed ");
//        System.out.println("--------------------------");
//        for(int i = input; i <= max; i++){
//            System.out.println(i + "    |     " + (int) Math.pow(i, 2) + "    |     " + (int) Math.pow(i, 3));
//
//
//
//
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade 0-100");
        int grade = sc.nextInt();
        if ((grade <= 100) && (grade >= 88)){
            System.out.printf("Your grade of %s results in an A", grade);
        }
        if ((grade <= 87) && (grade >= 80)){
            System.out.printf("Your grade of %s results in an B", grade);
        }
        if ((grade <= 79) && (grade >= 67)){
            System.out.printf("Your grade of %s results in an C", grade);
        }
        if ((grade <= 66) && (grade >= 60)){
            System.out.printf("Your grade of %s results in an D", grade);
        }
        if ((grade <= 59) && (grade >= 0)){
            System.out.printf("Your grade of %s results in an F", grade);
        }
}
}
