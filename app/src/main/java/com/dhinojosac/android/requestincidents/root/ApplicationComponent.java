package com.dhinojosac.android.requestincidents.root;

import com.dhinojosac.android.requestincidents.MainActivity;
import com.dhinojosac.android.requestincidents.http.ApiModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by negro-PC on 27-Dec-16.
 */
@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {
    //inject activity
    void inject(MainActivity target);
}
