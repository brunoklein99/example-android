package com.klein.greendaotest.data.repo;

import android.util.Log;

import com.klein.greendaotest.data.repo.model.User;

/**
 * Created by klein-desk on 21-Jun-17.
 */

public class DefaultUserRepository implements UserRepository {

    @Override
    public void add(User entity) {
        Log.v("bla", "adding user: " + entity.toString());
    }

}
