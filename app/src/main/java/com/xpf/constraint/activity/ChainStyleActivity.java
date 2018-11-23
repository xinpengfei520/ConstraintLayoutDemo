package com.xpf.constraint.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xpf.constraint.R;

/**
 * 链样式
 */
public class ChainStyleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_style);

        /*
         * 链是在一个维度，管理一组控件（水平或者垂直）的方式
         * 它们在同一个方向上双向引用。
         *
         * 链有以下几种样式：
         * 1.Spread Chain 展开的样式，相互约束的各控件之间的间距相等（包含链外部的约束）；
         *
         * 2.Spread Inside Chain 展开的样式，相互约束的各控件内部之间的间距相等，可以理解为链的内部，
         * 和第一种样式，可这样区分，一种是对外，一种是对内；
         *
         * 3.Packed Chain 链的元素将被打包在一起
         *
         * 4.Packed Chain With Bias 链的元素将被打包在一起，相比 3 多了偏移量
         *
         * 5.Spread Chain With Weight 相比 1 多了可以设置链各元素的权重来分配剩余的可用空间
         *
         */
    }
}
