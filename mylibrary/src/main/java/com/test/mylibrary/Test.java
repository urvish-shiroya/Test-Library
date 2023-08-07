package com.test.mylibrary;

import android.os.Environment;

import java.io.File;

public class Test {

    public static boolean isTestMode(){
        File file = new File(Environment.getExternalStorageDirectory(), "TEST");
        return file.exists();
    }

}
