package com.example.administrator.psalms.Write;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.psalms.R;

/**
 * Created by Administrator on 2017-08-01.
 */

public class WriteMainActivity {

    private TextView add;
    private TextView order;
    private RecyclerView topicRecycler;
    private Activity activity;
    WriteMainAdapter adapter;

    public WriteMainActivity(Activity activity) {
        this.activity = activity;
        init();
        setTopicRecycler();
        setListener();
    }

    private void init() {
        add = (TextView) activity.findViewById(R.id.add);
        order = (TextView) activity.findViewById(R.id.order);
        topicRecycler = (RecyclerView) activity.findViewById(R.id.topicRecycler);
        adapter = new WriteMainAdapter(activity);
    }

    private void setTopicRecycler(){
        topicRecycler.setAdapter(adapter);
        topicRecycler.setLayoutManager(new LinearLayoutManager(activity));
    }

    private void setListener(){
        add.setOnClickListener(v->{
            View view = View.inflate(activity, R.layout.custom_add_dialog, null);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("시편 추가");
            builder.setView(view);
            builder.show();
        });
    }



}
