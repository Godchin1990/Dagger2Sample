package com.gzsll.dagger2sample.di.component;

import android.app.Activity;
import com.gzsll.dagger2sample.di.PerActivity;
import com.gzsll.dagger2sample.di.module.ActivityModule;
import dagger.Component;

/**
 * Created by sll on 2016/5/19.
 */
@PerActivity
@Component(modules = { ActivityModule.class })
public interface ActivityComponent {

  Activity getActivity();
}
