package com.xpf.constraint.activity;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xpf.constraint.R;

/**
 * 代码中设置约束的扩展用法
 */
public class ConstraintSetExtendActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private ConstraintSet constraintSet1 = new ConstraintSet();
    private ConstraintSet constraintSet2 = new ConstraintSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_set_extend);
        constraintLayout = findViewById(R.id.main);
        constraintSet1.clone(constraintLayout);
        // 加载同不同样式的布局
        constraintSet2.clone(this, R.layout.activity_constraint_set_extend2);
    }

    public void onApplyClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);
        // 这种变化只是布局样式的变化，控件中的内容，选中等数据会同步保留过来
        constraintSet2.applyTo(constraintLayout);
    }

    public void onResetClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);
        constraintSet1.applyTo(constraintLayout);
    }
}
