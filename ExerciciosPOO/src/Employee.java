
public class Employee extends User {

    private Function function;

    public Employee(Function function, String name, String email, String password) {
        super(name, email, password);
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

}
