package com.xpf.constraint;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * 使用约束布局设置控件的边距
 */
public class MarginPropertyActivity extends AppCompatActivity {

    private Button btnA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_margin_property);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btnA = findViewById(R.id.btnA);
        findViewById(R.id.btnSetGone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 当 A 为 GONE 时，B 距离左边 160dp
                btnA.setVisibility(View.GONE);
            }
        });

        /*
         * 在 ConstraintLayout 中，除了我们之前设置边距的方式外，又新增了设置当
         * “被依赖” 控件为 GONE 时的边距，适用于当被依赖的控件为 GONE 时，依赖的控件的位置的变化
         * 如果不需要变化，可以设置被依赖控件为 invisible 或者 为 gone 时默认的处理方式即可。
         *
         * 对应的也有以下 6 个属性：
         *
         * layout_goneMarginStart
         * layout_goneMarginEnd
         * layout_goneMarginLeft
         * layout_goneMarginTop
         * layout_goneMarginRight
         * layout_goneMarginBottom
         *
         */

    }

}
