package com.klein.greendaotest.data.repo.model;

/**
 * Created by klein-desk on 21-Jun-17.
 */

public class User {

    private String login;

    private String password;

    public User(){

    }

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
