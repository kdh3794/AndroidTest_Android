package com.example.a60411.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2018-02-24.
 */

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    // 버튼 등등의 이벤트 처리
    public abstract void setupEvents();
    //화면 초기값 세팅,
    public abstract void setValues();
    //findViewById를 모아둔 메소드
    public abstract void bindViews();

}