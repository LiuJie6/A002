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

public class Activity03 extends Activity implements RadioGroup.OnCheckedChangeListener{
    RadioGroup radiogroup;
    int flag=0;
    Button display;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity03);
        display=(Button)findViewById(R.id.btn3);
        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
        radiogroup.setOnCheckedChangeListener(this);

    }
    public void onCheckedChanged(RadioGroup arg0, int arg1) {
        switch (arg1) {
            case R.id.radio0:
                flag=1;
                display.setText("Next");
                Toast.makeText(getBaseContext(), "17-21 ", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.radio1:
                flag=1;
                display.setText("Next");
                Toast.makeText(getBaseContext(), "22-27", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.radio2:
                flag=1;
                display.setText("Next");
                Toast.makeText(getBaseContext(), "28-31", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.radio3:
                flag=1;
                display.setText("Next");
                Toast.makeText(getBaseContext(), "32-37", Toast.LENGTH_SHORT)
                        .show();
                break;
            default:
                flag=0;
                break;
        }
    }
    public void btn3(View v){
        if(flag==0)
        {
            display.setText("Please choose one");
        }
        else{
        Intent intent = new Intent(getApplicationContext(),
                FourthActivity.class);
        startActivity(intent);}
    }
}
