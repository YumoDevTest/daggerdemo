package com.yumo.dagger.test;

import com.yumo.dagger.MainActivity;

import dagger.Component;

@Component
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
