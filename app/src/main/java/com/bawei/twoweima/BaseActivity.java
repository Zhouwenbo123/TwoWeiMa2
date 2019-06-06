package com.bawei.twoweima;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: Machenike
 * Date: 2019/6/6 15:01,周文博
 * Description:
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

}