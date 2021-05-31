package com.example.mealplanner;

public class UserCredentials {
    String name, username, password;
    int height, weight, age;

    public void User(String name, int age, String username, String password, int height, int weight){
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
        this.weight = weight;
        this.height = height;

    }

    public void User(String username, String password){
        this.username = username;
        this.password = password;
        this.age = 1;
        this.height = 56;
        this.weight = 10;
    }
}
