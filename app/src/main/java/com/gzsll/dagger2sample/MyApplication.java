package com.gzsll.dagger2sample;

import android.app.Application;
import com.gzsll.dagger2sample.di.component.ApplicationComponent;
import com.gzsll.dagger2sample.di.component.DaggerApplicationComponent;
import com.gzsll.dagger2sample.di.module.ApplicationModule;

/**
 * Created by sll on 2016/5/19.
 */
public class MyApplication extends Application {
  private ApplicationComponent mApplicationComponent;

  @Override public void onCreate() {
    super.onCreate();
    mApplicationComponent =
        DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
  }

  public ApplicationComponent getApplicationComponent() {
    return mApplicationComponent;
  }
}
