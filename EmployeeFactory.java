public class EmployeeFactory {

    // get the employee
    public static Employee getEmployee(String empType) {

        if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }

}
