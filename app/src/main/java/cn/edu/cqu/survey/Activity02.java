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

public class Activity02 extends Activity implements RadioGroup.OnCheckedChangeListener {
    int flag=0;
    RadioGroup radiogroup;
    Button display;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity02);
        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
        radiogroup.setOnCheckedChangeListener(this);
        display=(Button)findViewById(R.id.btn2);
    }
    public void onCheckedChanged(RadioGroup arg0, int arg1) {
        switch (arg1) {
            case R.id.radio0:
                flag=1;
                Toast.makeText(getBaseContext(), "Male ", Toast.LENGTH_SHORT)
                        .show();
            display.setText("Next");
                break;
            case R.id.radio1:
                flag=1;
                Toast.makeText(getBaseContext(), "Female", Toast.LENGTH_SHORT)
                        .show();
                display.setText("Next");
                break;
            default:
                flag=0;
                break;
        }
    }

    public void btn2(View v){
if(flag==0){
    display.setText("you have not choose one!!");
}
        else{
        Intent intent = new Intent(getApplicationContext(),
                Activity03.class);
        startActivity(intent);}
    }
}
