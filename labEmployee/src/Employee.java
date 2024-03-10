public class Employee {
    String employeeID, firstName, lastName;
    Benefits employeeBenefit = new Benefits();
    Address employeeHomeAddress = new Address();

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(String employeeID, String firstName, String lastName, Benefits benefits, Address address){
        this.employeeID = employeeID;
        this.employeeBenefit = new Benefits(benefits);
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeHomeAddress = new Address(address);
    }

    void printEmployee(){
        System.out.println("First: " + this.firstName + "\nLast: " + this.lastName + "\nID: " + employeeID);
        this.employeeBenefit.PrintBenefitInfo();
        this.employeeHomeAddress.PrintAddressInformation();
    }
}
