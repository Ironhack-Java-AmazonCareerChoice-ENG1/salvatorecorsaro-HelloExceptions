package com.ironhack.model;

import com.ironhack.exception.UserAgeNotValidException;
import com.ironhack.exception.UserException;

public class User {
    private String name;
    private int age;

    public static int MINIMUM_AGE = 18;


    public static boolean validateAge(int age){
        if (age < MINIMUM_AGE){
            throw new UserAgeNotValidException();
        }
        return true;
    }

    public boolean validateName(String name){
        if (name.matches("^[a-zA-Z]+\\s[a-zA-Z]+$")){
            return true;
        } else {
            throw new UserException("Name not valid!");
        }
    }

    public User() {
    }

    public User(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (validateName(name)){
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (validateAge(age)){
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
