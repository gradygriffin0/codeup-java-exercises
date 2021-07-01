import oop.oberon;

public class OopNotes {
    public static void main(String[] args) {
        oberon cohort1 = new oberon(23, "April", "October", true, "Java, Javascript, HTML");
        System.out.println(cohort1.listProperties());
        oberon alternateReality = new oberon(32, "October", "April", false, "Machine Code, C++, Binary");
        System.out.println(alternateReality.listProperties());
    }
}
