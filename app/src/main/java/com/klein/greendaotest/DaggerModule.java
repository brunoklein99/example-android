package com.klein.greendaotest;

import android.app.Application;
import android.content.Context;

import com.klein.greendaotest.data.repo.DefaultUserRepository;
import com.klein.greendaotest.data.repo.UserRepository;

import dagger.Module;
import dagger.Provides;

/**
 * Created by klein-desk on 21-Jun-17.
 */

@Module
public class DaggerModule {

    private Context context;

    public DaggerModule(Application context){
        this.context = context;
    }

    @Provides
    Context providesContext(){
        return context;
    }

    @Provides
    UserRepository providesUserRepository(){
        return new DefaultUserRepository();
    }

}
