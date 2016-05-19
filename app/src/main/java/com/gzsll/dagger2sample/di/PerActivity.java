package com.gzsll.dagger2sample.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by sll on 16/05/19.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity {
}
