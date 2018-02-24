package com.example.a60411.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MakeStartActivity extends com.example.a60411.myapplication.BaseActivity {

    private android.widget.Button leftBottomStart;
    private android.widget.Button leftTobStart;
    private android.widget.Button rightBottomStart;
    private android.widget.Button rightTopStart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_start);

    }

    @Override
    public void setupEvents() {
        leftBottomStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               printNormalStar();
            }
        });
        leftTobStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printNormalStar();
            }
        });

    }
    private void printReverseStar() {

        String startStr = "";
        for (int i=5; i>0; i--){
            for (int j=0; j<i; j++){
                startStr = startStr + "*";

            }
            startStr += '\n';

        }

    }
    private void printNormalStar() {
        // 기본형 별찍기
    String startStr = "";
    for (int i=0; i<5; i++){
        for (int j=0; j<=i; j++){
            startStr = startStr +"*";

        }
        startStr += '\n';

    }

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {


        this.rightTopStart = (Button) findViewById(R.id.rightTopStart);
        this.rightBottomStart = (Button) findViewById(R.id.rightBottomStart);
        this.leftTobStart = (Button) findViewById(R.id.leftTopStart);
        this.leftBottomStart = (Button) findViewById(R.id.leftBottomStart);
    }
}