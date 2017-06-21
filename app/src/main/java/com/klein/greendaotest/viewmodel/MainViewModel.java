package com.klein.greendaotest.viewmodel;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.klein.greendaotest.data.repo.UserRepository;
import com.klein.greendaotest.data.repo.model.User;

/**
 * Created by klein-desk on 20-Jun-17.
 */

public class MainViewModel {

    private final UserRepository repository;

    private String login;

    private String password;

    public MainViewModel(UserRepository repository){
        this.repository = repository;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void onLogin(){
        repository.add(new User(login, password));
    }

}
