package com.xpf.constraint.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xpf.constraint.R;

/**
 * 约束布局设置比例
 */
public class DimensionRatioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dimension_ratio);

        /*
         * 控件可以定义两个尺寸之间的比例，目前支持宽高比。
         * 前提条件是至少有一个尺寸设置为 0dp，然后通过 layout_constraintDimensionRatio
         * 属性设置宽高比。设置方式有以下几种：
         *
         * 直接设置一个float值，表示宽高比
         * 以” width：height”形式设置
         *
         * 通过设置前缀 W 或 H，指定一边相对于另一边的尺寸，如”H, 16:12”，高比宽为16:12
         * 如果宽高都设置为0dp，也可以用ratio设置。这种情况下控件会在满足比例
         * 约束的条件下，尽可能填满父布局。
         *
         */
    }
}
