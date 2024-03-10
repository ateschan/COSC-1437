public class Student {
    private String firstName, lastName;
    private Address addr;
    private ParkingPermit permit;

    public Student(){
        firstName = "";
        lastName = "";
        addr = new Address();
        permit = new ParkingPermit();
    }

    public Student(String first,String last,Address addr,ParkingPermit perm){
        this.firstName = first;
        this.lastName = last;
        this.addr = new Address(addr);
        this.permit = new ParkingPermit(perm);
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

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public ParkingPermit getPermit() {
        return permit;
    }

    public void setPermit(ParkingPermit permit) {
        this.permit = permit;
    }
}
