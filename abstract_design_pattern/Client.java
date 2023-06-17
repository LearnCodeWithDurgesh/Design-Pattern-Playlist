public class Client {

    public static void main(String[] args) {

        // i want to get android developer

        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.name();

        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());

        e2.name();

        Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
        e3.name();

    }
}
