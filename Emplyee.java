package com.company;

public abstract class Emplyee implements Payable{

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Emplyee(String first, String last, String ssn){
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }

    public void setFirstName (String first){
        firstName = first;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String toString() {
        return String.format("%s %s \nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
