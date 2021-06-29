public class MethodExercises {
    public static void main(String[] args) {

        System.out.println(integerAddition(40, 40));

        System.out.println(integerSubtraction(40, 40));

        System.out.println(integerMultiplication(40, 40));

        System.out.println(integerDivision(40, 0));
    }
//1
    public static int integerAddition(int num1, int num2){
        return num1 + num2;
    }
    public static int integerSubtraction(int num1, int subtractor){
        return num1 - subtractor;
    }
    public static int integerMultiplication(int num1, int num2){
        return num1 * num2;
    }
    public static int integerDivision(int num1, int divisor){
        if (divisor == 0){
            System.out.println("Can't divide by 0");
            return num1;
        }
        return num1 / divisor;
    }

}
