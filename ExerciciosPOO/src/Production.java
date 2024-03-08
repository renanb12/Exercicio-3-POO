
public class Production {

    private Order order;
    private Employee employee;

    public Production(Order order, Employee employee) {
        this.order = order;
        this.employee = employee;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
