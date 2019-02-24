package com.example.daggerexample;


import javax.inject.Singleton;

import dagger.Component;

@Singleton //Only one time instantiated
@Component(modules = ApplicationModule.class)  //Enables the modules
public interface ApplicationComponent {
    void injection(MainActivity target);  //Injection method inject dependencies
}

/* This is the component of the dagger 2. Component enables the modules & is used to inject the dependencies. */
