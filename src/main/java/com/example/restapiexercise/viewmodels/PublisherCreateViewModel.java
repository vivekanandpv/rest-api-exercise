package com.example.restapiexercise.viewmodels;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PublisherCreateViewModel {
    @NotBlank(message = "Cannot accept null, empty, or whitespace for publisher name")
    @Size(min = 5, max = 50)
    private String name;

    @NotBlank
    private String addressLine1;
    private String addressLine2;

    @NotBlank
    @Size(min=5, max = 200)
    private String city;

    @NotBlank
    @Size(min=5, max = 200)
    private String country;

    @NotBlank
    @Email
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
