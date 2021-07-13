import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class quiztest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,2,3};
        System.out.println(Arrays.equals(arr1, arr2));
        sortDesc(12345);
    }

        public static int sortDesc(final int num) {
            String temp = Integer.toString(num);
            int[] newArr = new int[temp.length()];
            int j = temp.length();
            for (int i = 0; i < temp.length(); i++) {
                newArr[j - 1] = temp.charAt(i) - '0';
                j--;
                System.out.println(Arrays.toString(newArr));
            }
            Integer[] boxedArray = Arrays.stream(newArr).boxed().toArray(Integer[]::new);

            List<Integer> list = new ArrayList<>();

            Collections.addAll(list, boxedArray);

            return 0;
        }
    }
