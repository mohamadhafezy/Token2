package com.example.Token2.model;

/**
 * Created by Mohammad on 5/5/2020.
 */
public class AuthenticationResponse {
    private String jwt;

    public String getJwt() {
        return jwt;
    }

    public AuthenticationResponse(String jwt) {

        this.jwt = jwt;
    }
}
