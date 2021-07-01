public class Person {
    public static void main(String[] args) {
        Person me = new Person("Grady");
        System.out.println(me.sayHello());
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
