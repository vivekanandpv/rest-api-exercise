package com.example.restapiexercise.viewmodels;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BookCreateViewModel {
    @NotBlank
    @Size(min = 5, max = 50)
    private String title;

    @Min(value = 0)
    @Max(value = 1_000_000)
    private double price;

    @Min(value = 10)
    @Max(value = 5_000)
    private int pages;

    @Min(value = 1)
    @Max(value = 100)
    private int edition;

    @Min(value = 1)
    @Max(value = 2_000_000_000)
    private int publisherId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }
}
