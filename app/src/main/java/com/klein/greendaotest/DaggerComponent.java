package com.klein.greendaotest;

import dagger.Component;

/**
 * Created by klein-desk on 21-Jun-17.
 */

@Component(modules = {
        DaggerModule.class
})
public interface DaggerComponent {
    void inject(MainActivity activity);
}
