package com.gzsll.dagger2sample.view;

import android.support.v7.app.AppCompatActivity;
import com.gzsll.dagger2sample.MyApplication;
import com.gzsll.dagger2sample.di.component.ApplicationComponent;

/**
 * Created by sll on 2016/5/19.
 */
public class BaseActivity extends AppCompatActivity {
  public ApplicationComponent getApplicationComponent() {
    return ((MyApplication) getApplication()).getApplicationComponent();
  }
}
