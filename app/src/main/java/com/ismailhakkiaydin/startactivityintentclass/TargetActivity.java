package com.ismailhakkiaydin.startactivityintentclass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Intent intent2 = this.getIntent();
        TextView txt = new TextView(this);
        txt.setText(intent2.getStringExtra("USER"));
        setContentView(txt);

    }

}
