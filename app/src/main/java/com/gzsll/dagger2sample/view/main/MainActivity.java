package com.gzsll.dagger2sample.view.main;

import android.os.Bundle;
import android.widget.TextView;
import com.gzsll.dagger2sample.R;
import com.gzsll.dagger2sample.di.module.ActivityModule;
import com.gzsll.dagger2sample.view.BaseActivity;
import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainContract.View {

  private TextView tvName;

  @Inject MainPresenter mPresenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    DaggerMainComponent.builder()
        .applicationComponent(getApplicationComponent())
        .activityModule(new ActivityModule(this))
        .mainModule(new MainModule())
        .build()
        .inject(this);
    tvName = (TextView) findViewById(R.id.tvName);
    mPresenter.attachView(this);
    mPresenter.getUser();
  }

  @Override public void showUserName(String name) {
    tvName.setText(name);
  }
}
