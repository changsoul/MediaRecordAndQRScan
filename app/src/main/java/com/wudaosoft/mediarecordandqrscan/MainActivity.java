package com.wudaosoft.mediarecordandqrscan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private static final String STREAM_URL = "rtmp://10.10.5.119/live/livestream";

    protected String getUrl(){
        return STREAM_URL;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.record_btn)
    void onRecordClick(){
        Log.d(TAG, "onRecordClick: asdfasdfweqrqwer");
        startActivity(RecordActivity.makeIntent(STREAM_URL));
    }
}
