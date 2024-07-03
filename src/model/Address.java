package model;

public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;

    public Address(String street, String city, String state, String postalCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" + "\n" +
                "street : " + street + "," + "\n" +
                "city : " + city + "," + state + "," + "\n" +
                "postalCode : " + postalCode + "\n" +
                "}";
    }
}
