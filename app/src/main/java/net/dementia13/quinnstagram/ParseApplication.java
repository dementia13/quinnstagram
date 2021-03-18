package net.dementia13.quinnstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import net.dementia13.quinnstagram.models.Post;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register Parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JoDfXddLLDrHqwN7cF7qFtFdIltW74dlEEgdqhl2")
                .clientKey("3oMJbrXYb40uHwbWbT9QNKkK7NSHM3D4mqtqkObs")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}

