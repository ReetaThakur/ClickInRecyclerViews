package com.example.clickinrecyclerviews;

public class StudentModel {
    private String name;
    private int age;
    private String address;
    private String DOB;
    private int imageId;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDOB() {
        return DOB;
    }

    public int getImageId() {
        return imageId;
    }

    public StudentModel(String name, int age, String address, String DOB, int imageId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.DOB = DOB;
        this.imageId = imageId;
    }
}
