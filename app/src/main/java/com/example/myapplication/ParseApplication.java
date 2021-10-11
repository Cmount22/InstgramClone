package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        //Set applicationID and server, server based on the values in the Heroku settings.
        //clientKey is not needed unless explicitly configured
        //any network interceptors must be added with the configuration Builder given this syntax

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("rr9RWq6A5AgyPOXlGuEd2dbyqrvXh6PLMkvda6iJ")
                .clientKey("X2JJ63k6Sog2YNmRuxscc5IcXowvv2pXXzucb0oZ")
                .server("https://parseapi.back4app.com")
                .build());
    }   }

