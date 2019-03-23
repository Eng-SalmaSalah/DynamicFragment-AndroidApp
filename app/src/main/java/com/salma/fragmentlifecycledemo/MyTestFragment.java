package com.salma.fragmentlifecycledemo;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyTestFragment extends Fragment {

    public static final String TAG="LifeCycleMethod";

    public MyTestFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG,"onAttachFragment");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreateFragment");

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_my_test, container, false);
        Log.i(TAG,"onCreateViewFragment");
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG,"onActivityCreatedInFragment");

    }

    @Override
    public void onStart() {
        Log.i(TAG,"onStartFragment");
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"onResumeFragment");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"onPauseFragment");

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceStateFragment");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG,"onStopFragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG,"onDestroyViewFragment");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroyFragment");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG,"onDetachFragment");

    }
}
