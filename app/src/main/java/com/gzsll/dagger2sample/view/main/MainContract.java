package com.gzsll.dagger2sample.view.main;

/**
 * Created by sll on 2016/5/19.
 */
public interface MainContract {

  public interface View {
    void showUserName(String name);
  }

  interface Presenter {
    void attachView(View view);

    void getUser();
  }
}
