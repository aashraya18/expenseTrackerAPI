package com.aashraya.expenseTrackerAPI.domain;

public class User {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    private String password;

    public User(Integer userId, String firstname, String lastName, String email, String password) {
        this.userId = userId;
        this.firstName = firstname;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

}
