package practice_3;

public class Company {
    final int employeeID;
    static String companyName;
    String employeeName;

    public Company(int employeeIDValue, String employeeNameValue) {
        employeeID = employeeIDValue;
        employeeName = employeeNameValue;
    }

    public static void printCompanyName() {
        System.out.println(companyName);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeName(String newName) {
        employeeName = newName;
    }

//    public void setEmployeeID(int newID) {
//        employeeID = newID;
//    }

    public static void main(String[] args) {
        Company newEmployee1 = new Company(1234567, "Ivan Ivanov");
        Company newEmployee2 = new Company(1234567, "Petr Petrov");
        Company.printCompanyName();

        Company.companyName = "Test";
        Company.printCompanyName();

//        newEmployee1.employeeID = 100;
    }
}
