package com.xpf.constraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 使用约束布局设置控件的相对位置
 */
public class RelativeLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_releative_location);

        /*
         * 总共有 13 个属性，即 6 对 + 一个 Baseline
         *
         * layout_constraintLeft_toLeftOf
         * layout_constraintLeft_toRightOf
         * layout_constraintRight_toLeftOf
         * layout_constraintRight_toRightOf
         * layout_constraintTop_toTopOf
         * layout_constraintTop_toBottomOf
         * layout_constraintBottom_toTopOf
         * layout_constraintBottom_toBottomOf
         * layout_constraintBaseline_toBaselineOf
         * layout_constraintStart_toEndOf
         * layout_constraintStart_toStartOf
         * layout_constraintEnd_toStartOf
         * layout_constraintEnd_toEndOf
         *
         * 上面虽多，但是其实也不多，两两配对，随意记忆起来也比较容易
         *
         * 拿其中一个举例子吧，我们知道，要设置一个空间的相对位置，有上下左右等
         * 例如，设置一个控件左边的约束，也就是 constraintLeft, 另外它必须有一个参照物，
         * 我们这个控件即可以在参照物的左边也可以在参照物的右边，因此，设置左边约束的属性
         * 就有两个，分别是 toLeftOf 和 toRightOf ，其他属性也是同样的道理！
         *
         */
    }
}
