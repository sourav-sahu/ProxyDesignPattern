public class EmployeeTableImpl implements EmployeeTable {
    @Override
    public void addEmployee() {
        System.out.println("Employee Added");
    }

    @Override
    public void removeEmployee() {
        System.out.println("EmployeeRemoved");

    }

    @Override
    public void getEmployee() {
        System.out.println("Employee Fetched");

    }
}
