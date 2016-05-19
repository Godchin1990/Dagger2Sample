package com.gzsll.dagger2sample.view.main;

import com.gzsll.dagger2sample.di.PerActivity;
import com.gzsll.dagger2sample.model.GetUser;
import dagger.Module;
import dagger.Provides;

/**
 * Created by sll on 2016/5/19.
 */
@Module public class MainModule {

  @PerActivity @Provides GetUser getUser() {
    return new GetUser();
  }
}
