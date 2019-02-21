package com.example.daggerexample;

import android.app.Application;
import dagger.android.DaggerActivity;

import dagger.android.DaggerApplication;

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component= DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
