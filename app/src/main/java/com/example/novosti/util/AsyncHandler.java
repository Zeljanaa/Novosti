package com.example.novosti.util;

import android.os.Handler;

public class AsyncHandler {

    private static  Handler backgroundHandler;

    public static final Handler getHandler(){
        return new Handler();
    }

}
