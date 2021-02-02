package com.alprsntrkk.AndroidMVVM;

import android.app.Application;

import com.alprsntrkk.AndroidMVVM.di.PostContainer;

public class MyApp extends Application {
    public PostContainer postContainer = new PostContainer();
}
