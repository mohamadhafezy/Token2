package com.example.Token2.model;

/**
 * Created by Mohammad on 5/4/2020.
 */
public class AuthenticationRequest {
  private String userName;
  private String password;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
