public class DeveloperClient {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee);
        int salary = employee.salary();
        System.out.println("Salary : " + salary);

        Employee employee2 = EmployeeFactory.getEmployee(("WEB DEVELOPER"));
        System.out.println("Salary : " + employee2.salary());
    }
}
