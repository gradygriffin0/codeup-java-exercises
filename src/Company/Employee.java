package Company;

// abstract keyword
// no longer can instantiate Employee.
public abstract class Employee {
//    define fields
    protected String salary;
    protected String name;

    public String doWork(){
        return "I am working";
    }
}
