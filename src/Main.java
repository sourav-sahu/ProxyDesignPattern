public class Main {
    public static void main(String[] args){
        EmployeeTableProxy adminProxy = new EmployeeTableProxy("Admin");
        EmployeeTableProxy userProxy = new EmployeeTableProxy("User");
        adminProxy.addEmployee();
        adminProxy.removeEmployee();
        adminProxy.getEmployee();
        userProxy.addEmployee();
        userProxy.removeEmployee();
        userProxy.getEmployee();
    }
}
