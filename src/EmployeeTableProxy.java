public class EmployeeTableProxy implements EmployeeTable {
    EmployeeTableImpl employeeTableImpl;
    String name;

    public EmployeeTableProxy(String name) {
        this.employeeTableImpl = new EmployeeTableImpl();
        this.name = name;
    }

    @Override
    public void addEmployee() {
        if (name.equals("Admin")){
            employeeTableImpl.addEmployee();
        }
        else{
            System.out.println("Invalid Access");
        }

    }

    @Override
    public void removeEmployee() {
        if (name.equals("Admin")){
            employeeTableImpl.removeEmployee();
        }
        else {
            System.out.println("Invalid access");
        }

    }

    @Override
    public void getEmployee() {
        if(name.equals("Admin")||name.equals("User")){
            employeeTableImpl.getEmployee();
        }
        else {
            System.out.println("Invalid Access");
        }

    }
}
