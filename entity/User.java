package address_book_system.entity;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String address;
    private String city;
    private String state;
    private String email;
    private String zipcode;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public User() {
    }

    public User(int id, String firstName, String mobileNumber,
                String lastName, String address, String city,
                String state, String email, String zipcode) {
        this.id = id;
        this.firstName = firstName;
        this.mobileNumber = mobileNumber;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return
                "id             = " + id +
                "\nfirstName    = " + firstName +
                "\nlastName     = " + lastName +
                "\nmobileNumber = " + mobileNumber +
                "\naddress      = " + address +
                "\ncity         = " + city +
                "\nstate        = " + state +
                "\nemail        = " + email +
                "\nzipcode      = " + zipcode;

    }
}
