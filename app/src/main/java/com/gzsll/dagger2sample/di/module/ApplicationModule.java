package com.gzsll.dagger2sample.di.module;

import android.content.Context;
import com.gzsll.dagger2sample.MyApplication;
import com.gzsll.dagger2sample.di.PerApp;
import com.gzsll.dagger2sample.util.ToastUtils;
import dagger.Module;
import dagger.Provides;

/**
 * Created by sll on 2016/5/19.
 */
@Module public class ApplicationModule {
  private final MyApplication myApplication;

  public ApplicationModule(MyApplication myApplication) {
    this.myApplication = myApplication;
  }

  @PerApp @Provides Context provideContext() {
    return myApplication.getApplicationContext();
  }

  @PerApp @Provides ToastUtils provideToastUtils(Context mContext) {
    return new ToastUtils(mContext);
  }
}
