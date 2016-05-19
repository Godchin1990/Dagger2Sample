package com.gzsll.dagger2sample.view.main;

import com.gzsll.dagger2sample.di.PerActivity;
import com.gzsll.dagger2sample.model.GetUser;
import com.gzsll.dagger2sample.util.ToastUtils;
import javax.inject.Inject;

/**
 * Created by sll on 2016/5/19.
 */
@PerActivity public class MainPresenter implements MainContract.Presenter {

  private MainContract.View mMainView;
  private final GetUser mGetUser;
  private final ToastUtils mToastUtils;

  @Inject public MainPresenter(GetUser mGetUser, ToastUtils mToastUtils) {
    this.mGetUser = mGetUser;
    this.mToastUtils = mToastUtils;
  }

  @Override public void attachView(MainContract.View view) {
    mMainView = view;
  }

  @Override public void getUser() {
    String name = mGetUser.getUser().name;
    mMainView.showUserName(name);
    mToastUtils.showToast(name);
  }
}
