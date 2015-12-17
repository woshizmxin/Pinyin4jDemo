package com.test.pinyin4jdemo;

import android.app.Activity;
import android.os.Bundle;

import net.sourceforge.pinyin4j.PinyinHelper;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray('单');
        for(int i = 0; i < pinyinArray.length; ++i){
            System.out.println(pinyinArray[i]);
        }
    }
}
