package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GcGYZ2EgraKxq3SZprrUr1raQiWLteUuO9swPzyP")
                .clientKey("ULJxFCUyRLbzfNm1oDITc6E2pCsL3pOOPdF1GfJx")
                .server("https://parseapi.back4app.com")
                .build() );
    }
}
