package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nU2Zxaxq9rPIYUj0ehTMV9n1PxquZiWva6H0YNwX")
                .clientKey("8lTjBhXcqTXGDeGzTWmDOOtRyNviSNyUFC9qIuva")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
