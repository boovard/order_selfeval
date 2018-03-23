package com.switchfully.order.domain.customers;

import java.util.UUID;

public class Customer {

    private UUID id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Address address;
    private String phoneNumber;

    private Customer() {
    }

    public Customer(String firstName, String lastName, String emailAddress, Address address, String phoneNumber) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static class CustomerBuilder{
        private UUID id;
        private String firstName;
        private String lastName;
        private String emailAddress;
        private Address address;
        private String phoneNumber;

        private CustomerBuilder(){}

        public static CustomerBuilder customer(){
            return new CustomerBuilder();
        }

        public Customer build(){
            Customer customer = new Customer();
            customer.setId(id);
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setEmailAddress(emailAddress);
            customer.setAddress(address);
            customer.setPhoneNumber(phoneNumber);
            return customer;
        }

        public CustomerBuilder withId(UUID id){
            this.id = id;
            return this;
        }

        public CustomerBuilder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder withEmailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

        public CustomerBuilder withAddress(Address address){
            this.address = address;
            return this;
        }

        public CustomerBuilder withPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
    }
}
