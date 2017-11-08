package com.conhea.floatingactionbutton.sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View parentLayout = findViewById(R.id.coordinator_layout);

        findViewById(R.id.action_b).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(parentLayout,"Clicked pink Floating Action Button", Snackbar.LENGTH_LONG).show();
            }
        });

    }
}
