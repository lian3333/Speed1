package com.example.speed12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if (view==btn1){
            Intent intent=new Intent(this,GameActivity.class);
            startActivity(intent);
        }
        if (view==btn2){
            Intent intentinst=new Intent(this,Instructions.class);
            startActivity(intentinst);
        }
        if (view==btn3){
            Intent intentset=new Intent(this,Setting.class);
            startActivity(intentset);
        }
    }
}