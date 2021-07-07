package warmup;
//Create a method that will return how many capital letters are in a string.
public class todo1 {
    public static void main(String[] args) {
        System.out.println(stringCounter("ALL CAPITAL LETTERS"));
    }
    public static class Counter{
        public static int count;
    }
    public static int stringCounter(String countedString){
        Counter.count = 0;
        char[] arr = new char[countedString.length()];
        for (int i = 0; i < countedString.length(); i++){
            arr[i] = countedString.charAt(i);
        }

        for (int i = 0; i < countedString.length(); i++){
            System.out.println(arr[i]);
            if(Character.isUpperCase(arr[i])){
                Counter.count++;
            }
        }
        return Counter.count;

    }
}
