package com.xpf.constraint.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xpf.constraint.R;

/**
 * 设置偏移量
 */
public class BiasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bias);

        /*
         * 偏移量指的是从原点开始的偏移量
         *
         * 在设置控件的居中属性之后，通过偏移属性可以设置让控件更偏向于依赖控件的某一方，
         * 偏移设置为0～1之间的值。相应属性：
         *
         * layout_constraintHorizontal_bias // 水平偏移
         * layout_constraintVertical_bias   // 垂直偏移
         *
         * 必须设置居中后，设置的偏移才有效果，例如，偏移量是 0.5 则不偏移
         * 假如设置的是居中的偏移量，如果偏移量 < 0.5 则控件偏左侧，如果偏移量 > 0.5 则控件偏右侧
         *
         * 另外，还可以同时设置水平偏移和垂直的偏移量
         *
         */
    }
}
