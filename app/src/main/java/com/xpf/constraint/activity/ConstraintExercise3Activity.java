package com.xpf.constraint.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xpf.constraint.R;

/**
 * 约束布局练习2
 */
public class ConstraintExercise3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_exercise3);

        /*
         * 如何实现一个 -50dp 的 margin?
         * 约束布局中，是没有负距离的，我们可以间接地来实现这种效果
         */

    }
}
