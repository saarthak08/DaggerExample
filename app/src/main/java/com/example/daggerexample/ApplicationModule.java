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
    public Context providesContext() {     /* Provides the application dependencies. */
        return application;
    }
}

/* Module define the classes & methods which provide the dependencies. */