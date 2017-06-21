package com.klein.greendaotest;

import android.app.Application;
import dagger.Module;

/**
 * Created by klein-desk on 20-Jun-17.
 */

public class App extends Application {

    private DaggerComponent daggerComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        daggerComponent = createDaggerComponent();
    }

    public DaggerComponent getDaggerComponent() {
        return daggerComponent == null
                ? createDaggerComponent()
                : daggerComponent;
    }

    private DaggerComponent createDaggerComponent() {
        return DaggerDaggerComponent.builder().daggerModule(new DaggerModule(this)).build();
    }

    public void clearComponent() {
        daggerComponent = null;
    }

}
