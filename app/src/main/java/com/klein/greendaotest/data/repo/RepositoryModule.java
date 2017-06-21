package com.klein.greendaotest.data.repo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by klein-desk on 21-Jun-17.
 */

@Module
public class RepositoryModule {

    @Singleton
    @Provides
    UserRepository provideUserRepository(){
        return new DefaultUserRepository();
    }

}
