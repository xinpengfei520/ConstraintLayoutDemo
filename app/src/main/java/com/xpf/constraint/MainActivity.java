package com.xpf.constraint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xpf.constraint.activity.BiasActivity;
import com.xpf.constraint.activity.CenterLocationActivity;
import com.xpf.constraint.activity.ChainStyleActivity;
import com.xpf.constraint.activity.DimensionRatioActivity;
import com.xpf.constraint.activity.MarginPropertyActivity;
import com.xpf.constraint.activity.RelativeLocationActivity;
import com.xpf.constraint.activity.SizeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSetRelative).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(RelativeLocationActivity.class);
            }
        });
        findViewById(R.id.btnSetCenter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(CenterLocationActivity.class);
            }
        });
        findViewById(R.id.btnSetMargin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MarginPropertyActivity.class);
            }
        });
        findViewById(R.id.btnSetBias).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(BiasActivity.class);
            }
        });
        findViewById(R.id.btnSetSize).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(SizeActivity.class);
            }
        });
        findViewById(R.id.btnSetRatio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(DimensionRatioActivity.class);
            }
        });
        findViewById(R.id.btnChainStyle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ChainStyleActivity.class);
            }
        });
        findViewById(R.id.btnChainStyle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ChainStyleActivity.class);
            }
        });
    }


    private void startActivity(Class<?> clazz) {
        Intent intent = new Intent(MainActivity.this, clazz);
        startActivity(intent);
    }
}
