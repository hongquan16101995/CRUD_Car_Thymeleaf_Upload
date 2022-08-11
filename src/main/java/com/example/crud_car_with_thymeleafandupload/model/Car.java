package com.example.crud_car_with_thymeleafandupload.model;

import org.springframework.web.multipart.MultipartFile;

public class Car {
    private static int INDEX = 0;
    private int id;
    private String name;
    private String color;
    private double price;
    private String imageUrl;
    private MultipartFile image;

    public Car() {
    }

    public Car(String name, String color, double price, String imageUrl) {
        this.id = ++INDEX;
        this.name = name;
        this.color = color;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Car(String name, String color, double price, MultipartFile image) {
        this.id = ++INDEX;
        this.name = name;
        this.color = color;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
