package warmup;

public class Solution {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        parent1.parentPrint();

        Child child1 = new Child();
        child1.childPrint();
        child1.parentPrint();

    }
}
