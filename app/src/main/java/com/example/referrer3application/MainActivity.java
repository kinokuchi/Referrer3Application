package com.example.referrer3application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = new Intent(MainActivity.this, ReferrerReceiver.class);
        intent.setAction("com.android.vending.INSTALL_REFERRER");
        sendBroadcast(intent); // 明示的インテントをブロードキャストで送信します。

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
