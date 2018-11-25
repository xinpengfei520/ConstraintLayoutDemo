package com.xpf.constraint.activity;

import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xpf.constraint.R;

/**
 * 使用 Group 设置一组控件的可见性
 */
public class GroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        final Group group = findViewById(R.id.group);
        findViewById(R.id.btnSetVisible).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean visible = group.getVisibility() == View.VISIBLE;
                group.setVisibility(visible ? View.GONE : View.VISIBLE);
            }
        });
    }
}
