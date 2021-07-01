public class Person {
    public static void main(String[] args) {
        Person me = new Person("Grady");
        System.out.println(me.sayHello());
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
    }

    private String name;

    public Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String sayHello(){
        return "Hello, my name is " + name;
    }
}
