package com.example.grandmarket.data.model;

public class Users {

    String UserName;
    String UserCity;
    String UserEmail;
    String UserPassword;
    int UserId;


    public Users(String userName, String userCity, String userEmail, String userPassword, int userId) {
        UserName = userName;
        UserCity = userCity;
        UserEmail = userEmail;
        UserPassword = userPassword;
        UserId = userId;
    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserCity() {
        return UserCity;
    }

    public void setUserCity(String userCity) {
        UserCity = userCity;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }
}
