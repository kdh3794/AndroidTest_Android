package com.example.a60411.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

  /*
    작성일 : 2018년 2월 24일
    작성자 : 안도균
    제작의도 : 알고리즘 테스트 문제 화면으로 넘어가는 액티비티.
 */

public class AlgorithmListActivity extends BaseActivity implements View.OnClickListener {

    private Button multipleBtn;
    private Button starBtn;
    private Button gugudanBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm_list);
        bindViews();
        setupEvents();
        setValues();
    }


    @Override
    public void setupEvents() {

        multipleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, FindMultipleActivity.class);
                startActivity(intent);
            }
        });
        starBtn.setOnClickListener(this);
        gugudanBtn.setOnClickListener(this);
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.gugudanBtn = (Button) findViewById(R.id.gugudanBtn);
        this.starBtn = (Button) findViewById(R.id.starBtn);
        this.multipleBtn = (Button) findViewById(R.id.multipleBtn);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.gugudanBtn){
//          맞다 => 구구단 버튼이 눌림.
            Toast.makeText(mContext, "구구단버튼 클릭", Toast.LENGTH_SHORT).show();

        }
        else if (view.getId() ==R.id.starBtn){
//          별찍기 버튼 클릭
            Toast.makeText(mContext, "별찍기버튼 클릭", Toast.LENGTH_SHORT).show();
        }
    }
}