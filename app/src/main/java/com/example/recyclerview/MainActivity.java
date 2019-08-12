package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerViewAdapter mRcvAdapter;
    List<String> data;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<>();
        data.add("Le Van Thang");
        data.add("SaveInstanceState");
        data.add("setOrientation");
        data.add("File");
        data.add("Edit View");
        data.add("Navigate Code");
        data.add("Analyze Refacor");
        data.add("Buil Run Tools");
        data.add("VCS Window Help");
        data.add("compileDebugSources");
        data.add("assembleDebug");


        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mRcvAdapter = new RecyclerViewAdapter(this, data);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        staggeredGridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(staggeredGridLayoutManager);
        mRecyclerView.setAdapter(mRcvAdapter);

    }

//    RecyclerView mRecyclerView;
//    RecyclerViewAdapter mRcvAdapter;
//    List<String> data;
//    @SuppressLint("WrongConstant")
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
//        data = new ArrayList<>();
//        data.add("Nguyễn Minh Hưng");
//        data.add("Hoàng Minh Lợi");
//        data.add("Nguyễn Duy Bảo");
//        data.add("Nguyễn Ngọc Doanh");
//        data.add("Nguyễn Phạm Thế Hà");
//        data.add("Trần Anh Đức");
//        data.add("Trần Minh Hải");
//        mRcvAdapter = new RecyclerViewAdapter(this, data);
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//
//        mRecyclerView.setLayoutManager(layoutManager);
//        mRecyclerView.setAdapter(mRcvAdapter);
//
//        mRcvAdapter.setOnItemClickedListener(new RecyclerViewAdapter.OnItemClickedListener() {
//            @Override
//            public void onItemClick(String username) {
//                Toast.makeText(MainActivity.this, username, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//    }
}
