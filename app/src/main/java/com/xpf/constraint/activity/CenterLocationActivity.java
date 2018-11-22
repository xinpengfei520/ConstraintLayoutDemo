package com.xpf.constraint.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xpf.constraint.R;

/**
 * 使用约束布局设置控件的居中位置
 */
public class CenterLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_location);

        /*
         * 设置居中
         *
         * 1.设置水平居中
         *
         * 如果要让一个控件相对于父容器水平居中，就分别设置这个控件的左右约束都相对于父容器的左右即可
         *
         * 2.设置垂直居中
         *
         * 如果要让一个控件相对于父容器垂直居中，就分别设置这个控件的顶部和底部约束都相对于父容器的顶部和底部即可
         *
         * 3.设置水平垂直居中
         *
         * 这个就简单了，前两种设置的总和
         *
         */
    }
}
