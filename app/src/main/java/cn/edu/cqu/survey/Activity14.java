package cn.edu.cqu.survey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/11.
 */

public class Activity14 extends  Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity14);

    }


    public void btn141(View v){
        Intent intent = new Intent(getApplicationContext(),
                Activity15.class);
        startActivity(intent);
    }
    public void btn142(View v){
        Intent intent = new Intent(getApplicationContext(),
                Activity16.class);
        startActivity(intent);
    }
}
