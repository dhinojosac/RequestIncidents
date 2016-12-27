package com.dhinojosac.android.requestincidents.root;

import android.app.Application;

import com.dhinojosac.android.requestincidents.http.ApiModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by negro-PC on 27-Dec-16.
 */

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate(){
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModule(new ApiModule())
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }

}
