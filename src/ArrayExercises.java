import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        Person[] arr = {new Person("Grady"), new Person("Casey"), new Person("Laura")};
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].sayHello());
        }
        System.out.println(Arrays.toString(addPerson(arr, new Person("Bradley"))));
        Person[] people = addPerson(arr, new Person("Bradley"));

        System.out.println(people[people.length - 1].sayHello());

    }
    public static Person[] addPerson(Person[] arr, Person obj){

        Person[] newArr = new Person[arr.length+ 1];

        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                newArr[i] = arr[i];
                newArr[i+1] = obj;
                System.out.println(newArr[i].getName());
                System.out.println(newArr[i+1].getName());
            } else {
                newArr[i] = arr[i];
                System.out.println(newArr[i].getName());
            }
        }
        return newArr;

    }
}
