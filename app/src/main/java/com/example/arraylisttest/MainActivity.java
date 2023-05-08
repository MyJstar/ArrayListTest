package com.example.arraylisttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String [] str = {"축구","농구","여행","영화감상","모바일앱프로그래밍"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInfoDisplay(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("id","2021214111");
        bundle.putString("name","손흥민");
        bundle.putInt("year",3);
        bundle.putFloat("grade",4.49f);

        ArrayList<String> List = new ArrayList<String>();
        for (int i =0; i<str.length;i++)
            List.add(str[i]);

        bundle.putStringArrayList("hobby",List);
        informationTransfer(bundle);
    }

    private void informationTransfer(Bundle bundle) {
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);

        String str = "학생정보 출력";
        str = str + "\n학번:"+ bundle.getString("id");
        str = str + "\n이름:"+ bundle.getString("name");
        str = str + "\n학년:"+ bundle.getInt("year");
        str = str + "\n학점:"+ bundle.getFloat("grade");

        tv1.setText(str);

        str = "학생 취미 출력";
        ArrayList<String> List = bundle.getStringArrayList("hobby");
        for ( int i =0; i<List.size(); i++){
            str = str + "\n" + List.get(i);
        }
        tv2.setText(str);
    }
}