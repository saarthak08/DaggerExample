package com.example.daggerexample;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private Application application;
    public ApplicationModule(Application application)
    {
        this.application=application;
    }
    @Provides
    @Singleton
    public Context providesContext(){
        return application;
    }
}
