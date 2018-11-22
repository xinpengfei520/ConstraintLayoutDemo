package com.xpf.constraint.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xpf.constraint.R;

/**
 * 设置尺寸
 */
public class SizeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);

        /*
         * 设置尺寸：
         *
         * 1.设置固定尺寸，如 16dp
         * 2.使用 wrap_content，根据内容计算合适大小
         * 3.match_parent，填充满父布局，此时设置的约束都不生效了
         * 4.设置 0dp，相当于 MATCH_CONSTRAINT 属性，基于约束最终确定大小
         *
         * 设置最小值:
         * layout_constraintWidth_min 和 layout_constraintHeight_min
         *
         * 设置最大值:
         * layout_constraintWidth_max和layout_constraintHeight_max
         *
         * 设置控件相对于父容器的百分比大小(使用之前需要先设置为百分比模式，然后设置设置宽高值为0～1之间):
         * layout_constraintWidth_percent 和 layout_constraintHeight_percent
         *
         * 设置为百分比模式的属性：
         * app:layout_constraintWidth_default="percent"
         * app:layout_constraintHeight_default="percent"
         *
         * 强制约束:
         * 当一个控件设为 wrap_content 时，再添加约束尺寸是不起效果的。如需生效，需要设置如下属性为true:
         *
         * app:layout_constrainedWidth=”true|false”
         * app:layout_constrainedHeight=”true|false”
         *
         */
    }

}
