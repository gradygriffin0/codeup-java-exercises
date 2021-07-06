package Company;

// abstract keyword
// no longer can instantiate Employee.
public abstract class Employee {
//    define fields
    protected String salary;
    protected String name;



//    non abstract method, has definition, no abstract keyword...
    //    public String doWork(){
    //        return "I am working";
    //    }

//    abstact method
//
    public abstract String doWork();

}
