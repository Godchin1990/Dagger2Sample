package com.gzsll.dagger2sample.di.module;

import android.app.Activity;
import com.gzsll.dagger2sample.di.PerActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by sll on 2016/5/19.
 */
@Module public class ActivityModule {
  private final Activity mActivity;

  public ActivityModule(Activity mActivity) {
    this.mActivity = mActivity;
  }

  @Provides @PerActivity Activity provideActivity() {
    return mActivity;
  }
}
