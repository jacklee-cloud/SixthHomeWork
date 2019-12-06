package com.example.sixthhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MemberActivity extends AppCompatActivity {

    private String[]name={"廖心玥","刘莹","曾诗涵","邱静怡","杨婷婷","陈星余","李洋","谢宇城","田鸿","王薪鸿","刘浩楠","陶实",
            "陈浩南","杨宇","吴厚涛"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(
                MemberActivity.this , android.R.layout.simple_list_item_1,name);
        ListView listView=(ListView)findViewById(R.id.list_view1);
        listView.setAdapter(adapter);

    }
}
