package cn.edu.cqu.survey;

/**
 * Created by Administrator on 2017/3/11.
 */


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity13 extends Activity {

    private CheckBox chk1, chk2, chk3, chk4, chk5, chk6, chk7, chk8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity13);

        addListenerOnCheck1();
        addListenerOnCheck2();
        addListenerOnCheck3();
        addListenerOnCheck4();
    }
    private void addListenerOnCheck1() {
        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk4 = (CheckBox) findViewById(R.id.checkBox4);
        chk2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
              /*  result.append(chk1.isChecked());
                result.append(chk2.isChecked());
                result.append(chk3.isChecked());
                result.append(chk4.isChecked());
                Toast.makeText(Activity13.this, result.toString(),
                        Toast.LENGTH_LONG).show();*/
            }
        });

    }

    private void addListenerOnCheck2() {

        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk4 = (CheckBox) findViewById(R.id.checkBox4);
        chk3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
              /*  result.append(chk1.isChecked());
                result.append(chk2.isChecked());
                result.append(chk3.isChecked());
                result.append(chk4.isChecked());
                Toast.makeText(Activity13.this, result.toString
                        (), Toast.LENGTH_LONG).show();*/
            }
        });
    }

    private void addListenerOnCheck3() {
        // TODO Auto-generated method stub
        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk4 = (CheckBox) findViewById(R.id.checkBox4);
        chk1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
             /*   result.append(chk1.isChecked());
                result.append(chk2.isChecked());
                result.append(chk3.isChecked());
                result.append(chk4.isChecked());
                Toast.makeText(Activity13.this, result.toString(), Toast.LENGTH_LONG).show();*/

            }
        });

    }

    private void addListenerOnCheck4() {
        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk4 = (CheckBox) findViewById(R.id.checkBox4);
        chk4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
             /*   result.append(chk1.isChecked());
                result.append(chk2.isChecked());
                result.append(chk3.isChecked());
                result.append(chk4.isChecked());
                Toast.makeText(Activity13.this, result.toString(),
                        Toast.LENGTH_LONG).show();*/
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public void btn13(View v){
            Intent intent = new Intent(getApplicationContext(),
                    Activity14.class);
            startActivity(intent);
    }
}