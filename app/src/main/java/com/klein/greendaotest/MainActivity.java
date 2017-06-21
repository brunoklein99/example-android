package com.klein.greendaotest;

import android.databinding.DataBindingUtil;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.klein.greendaotest.data.repo.UserRepository;
import com.klein.greendaotest.databinding.MainActivityBinding;
import com.klein.greendaotest.viewmodel.MainViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    UserRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App) getApplication()).getDaggerComponent().inject(this);
        setContentView(R.layout.main_activity);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        binding.setVm(new MainViewModel(repository));
    }
}
