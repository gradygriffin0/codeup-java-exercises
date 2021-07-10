package grades;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        Student me = new Student("Grady");
        me.addGrade(100);
        me.addGrade(100);
        me.addGrade(100);
        me.addGrade(95.50);
        me.addGrade(75);
        me.addGrade(80);


        System.out.println(me.getGrades());
        System.out.println(me.getGradeAverage());

    }
    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getGrades() {
        return this.grades;
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }
    public double getGradeAverage(){
        double sum = 0;
        for (double grade : this.grades){
            sum += grade;
        }

        return sum/(this.grades.size());
    }
}
