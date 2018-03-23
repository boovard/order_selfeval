package com.switchfully.order.domain.customers;

public class Address {

    private String streetName;
    private String houseNumber;
    private String postCode;
    private String city;

    private Address() {
    }

    public Address(String streetName, String houseNumber, String postCode, String city) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static class AddressBuilder{
        private String streetName;
        private String houseNumber;
        private String postCode;
        private String city;

        private AddressBuilder(){}

        public static AddressBuilder address(){
            return new AddressBuilder();
        }

        public Address build(){
            Address address = new Address();
            address.setStreetName(streetName);
            address.setHouseNumber(houseNumber);
            address.setPostCode(postCode);
            address.setCity(city);
            return address;
        }

        public AddressBuilder withStreetName(String streetName){
            this.streetName = streetName;
            return this;
        }

        public AddressBuilder withHouseNumber(String houseNumber){
            this.houseNumber = houseNumber;
            return this;
        }

        public AddressBuilder withPostCode(String postCode){
            this.postCode = postCode;
            return this;
        }

        public AddressBuilder withCity(String city){
            this.city = city;
            return this;
        }

    }
}
