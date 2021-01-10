package com.example.myfragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance() {
        FirstFragment fragment = new FirstFragment();
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("myfrag","attach function called");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("myfrag","onCreate function called");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("myfrag","onStart function called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("myfrag","onResume function called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("myfrag","onPause function called");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.d("myfrag","onStop function called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("myfrag","onDestroyView function called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("myfrag","onDestroy function called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("myfrag","onDetach function called");
    }
}