package com.example.demoSpringBoot.api.model;

public class UserModel {

    private final int id;
    private final String documentType;
    private final String documentNumber;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String secondLastName;
    private final String phoneNumber;
    private final String address;
    private final String city;

    public UserModel(int id, String documentType, String documentNumber, String firstName,
                     String middleName, String lastName, String secondLastName,
                     String phoneNumber, String address, String city) {
        this.id = id;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }
}
