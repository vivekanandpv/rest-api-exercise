package com.example.restapiexercise.viewmodels;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PublisherUpdateViewModel {
    @NotBlank
    private String addressLine1;
    private String addressLine2;

    @NotBlank
    @Size(min=5, max = 200)
    private String city;

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
}
