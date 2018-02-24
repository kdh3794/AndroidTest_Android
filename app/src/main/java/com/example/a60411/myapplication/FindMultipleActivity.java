package com.example.a60411.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/*
    작성일 : 2018년 2월 24일
    작성자 : 안도균
    제작의도 : 입력한 두 숫자의 최소공배수를 찾아 결과로 출력.

    설명
    최소 공배수 =>3,5
     3의배수 : 3,6,9,12,15...
     5의배수 : 5,10,15,20,25...
     3과5의공배수 : (15), 30 ,45 ...
 */

public class FindMultipleActivity extends com.example.a60411.myapplication.BaseActivity {


    private android.widget.EditText firstNumEdt;
    private android.widget.EditText secondNumEdt;
    private android.widget.Button findMultipleBtn;
    private android.widget.TextView resultTxt;
    private android.widget.LinearLayout resultLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_multiple);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        findMultipleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //버튼이 눌리면 실행되는 코드

                //1. 두개의 입력된 숫자를 받아오기
                //EditText에 작성된 값 => Editable => toString 이용해 String변수로

                String firstString = firstNumEdt.getText().toString();
                //받아온 String을 int로 변환. Interger이용 => Wrapper클래스.
                int firstNum = 0;



                String secondString = secondNumEdt.getText().toString();
                int secondNum = 0;
                try {
                    Integer.parseInt(firstString);
                    Integer.parseInt(secondString);
                }
                catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(mContext, "입력에 문제가 발생했습니다.", Toast.LENGTH_SHORT).show();
                    return;
                }

                int result = 0;
                for (int i = 1; i <= firstNum * secondNum; i++) {
                    if (i % firstNum == 0 && i % secondNum == 0) {
                        //반복을 돌다가 둘다 0으로 나눠 떨어진다. => 공배수를 찾았다.
                        //지금 돌고 있는 i값(처음으로 찾아낸 값)이 최소공배수.
                        result = i;

                        //최소 공배수를 찾아내면, 더 이상 반복을 둘 필요가 x
                        break;
                    }
                }

                String resultStr = String.format("%d 입니다.", result);
                resultTxt.setText(resultStr);

                resultLayout.setVisibility(View.VISIBLE);
                //2. 두개의 숫자의 최소공배수를 탐색 . => JAVA 알고리즘
                //1~ 숫자를 증가. 12%3 && 12%5 => 둘다 0이라면 두 숫자의 공배수.
            }

        });
    }

    @Override
    public void setValues() {
    }

    @Override
    public void bindViews() {

        this.resultLayout = (LinearLayout) findViewById(R.id.resultLayout);
        this.resultTxt = (TextView) findViewById(R.id.resultTxt);
        this.findMultipleBtn = (Button) findViewById(R.id.findMultipleBtn);
        this.secondNumEdt = (EditText) findViewById(R.id.secondNumEdt);
        this.firstNumEdt = (EditText) findViewById(R.id.firstNumEdt);
    }


}