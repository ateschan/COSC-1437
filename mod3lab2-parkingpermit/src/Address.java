public class Address {
    private String street, city, state, zip;

    public Address(){
        street = "";
        city = "";
        state = "";
        zip = "";
    }

    public Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this. zip = zip;
    }

    public Address(Address addr){
        this.street = addr.street;
        this.city = addr.city;
        this.state = addr.state;
        this.zip = addr.zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    public void PrintAddressInformation(){
        System.out.println("Street: " + this.street + "\nCity: " + this.city + "\nState: " + this.state + "\nZip: " + this.zip);
    }
}
