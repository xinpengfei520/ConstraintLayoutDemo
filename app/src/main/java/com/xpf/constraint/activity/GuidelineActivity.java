package com.xpf.constraint.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xpf.constraint.R;

/**
 * 设置布局辅助线
 */
public class GuidelineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guideline);

        /*
         * 布局辅助线，用于布局辅助，不在设备上显示。
         *
         * 有垂直和水平两个方向，宽度为0，高度等于父容器
         *
         * 三种放置 Guideline 的方式：
         *
         * 1.给定距离左边或顶部一个固定距离（layout_constraintGuide_begin）
         * 2.给定距离右边或底部一个固定距离（layout_constraintGuide_end）
         * 3.给定宽高一个百分比距离（layout_constraintGuide_percent）
         *
         * 注：begin & end 只能使用一个
         */
    }
}
