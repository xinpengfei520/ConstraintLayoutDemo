package com.xpf.constraint.activity;

import android.os.Bundle;
import android.support.constraint.Placeholder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xpf.constraint.R;

/**
 * A Placeholder provides a virtual object which can position an existing object.
 * 顾名思义就是占位符的意思，可以动态设置一个布局文件
 */
public class PlaceholderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeholder);

        final Placeholder placeHolder = findViewById(R.id.placeHolder);
        placeHolder.setEmptyVisibility(View.GONE);
        findViewById(R.id.btnSetPlaceHolder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View content = placeHolder.getContent();
                if (content == null) {
                    placeHolder.setContentId(R.id.tvOrigin);
                }
            }
        });

    }
}
