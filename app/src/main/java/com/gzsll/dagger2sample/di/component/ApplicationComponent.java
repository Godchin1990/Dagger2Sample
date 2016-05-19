package com.gzsll.dagger2sample.di.component;

import android.content.Context;
import com.gzsll.dagger2sample.MyApplication;
import com.gzsll.dagger2sample.di.PerApp;
import com.gzsll.dagger2sample.di.module.ApplicationModule;
import com.gzsll.dagger2sample.util.ToastUtils;
import dagger.Component;

/**
 * Created by sll on 2016/5/19.
 */
@PerApp
@Component(modules = { ApplicationModule.class })
public interface ApplicationComponent {
  Context getContext();

  ToastUtils getToastUtils();

  void inject(MyApplication mApplication);
}
