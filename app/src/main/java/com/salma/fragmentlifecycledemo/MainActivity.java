package com.salma.fragmentlifecycledemo;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG="LifeCycleMethod";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreateActivity");
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.i(TAG,"onAttachFragmentToActivity");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStartActivity");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResumeActivity");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPauseActivity");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceStateActivity");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStopActivity");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroyActivity");

    }
}
