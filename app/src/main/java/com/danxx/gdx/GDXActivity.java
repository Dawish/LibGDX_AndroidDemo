package com.danxx.gdx;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;

/**
 * @Description:
 * @Author: Danxingxi
 * @CreateDate: 2016/12/7 19:14
 */
public class GDXActivity extends AndroidApplication {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.loadLibrary("gdx");
        initialize(new IAppListener());
    }
}
