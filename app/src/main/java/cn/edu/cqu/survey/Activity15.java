package cn.edu.cqu.survey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/3/12.
 */

public class Activity15 extends Activity {


EditText et;
    TextView display;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity15);

       et =(EditText) findViewById(R.id.edt15);
        display=(TextView) findViewById(R.id.tex15);
    }

    public void btn151(View v){
        et.setText("");
    }

    public void btn152(View v){
       if(et.getText().toString().indexOf("@")<0|et.getText().toString().indexOf(".cn")<0)
       {
           display.setText("Please input correct email");
       }
       else {
           Intent intent = new Intent(getApplicationContext(),
                   Activity16.class);
           startActivity(intent);
       }

    }
}
