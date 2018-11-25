package com.xpf.constraint.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xpf.constraint.R;

/**
 * Circular positioning (Added in 1.1)
 */
public class CircularPositionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_position);

        /*
         * 设置 B 相对于 A 100dp 且 在 A 的 45 度方向上
         */
    }
}
