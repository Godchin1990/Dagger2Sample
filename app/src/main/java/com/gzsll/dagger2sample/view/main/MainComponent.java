package com.gzsll.dagger2sample.view.main;

import com.gzsll.dagger2sample.di.PerActivity;
import com.gzsll.dagger2sample.di.component.ApplicationComponent;
import com.gzsll.dagger2sample.di.module.ActivityModule;
import dagger.Component;

/**
 * Created by sll on 2016/5/19.
 */
@PerActivity @Component(dependencies = ApplicationComponent.class, modules = {
    MainModule.class, ActivityModule.class
}) public interface MainComponent {

  void inject(MainActivity mActivity);
}
