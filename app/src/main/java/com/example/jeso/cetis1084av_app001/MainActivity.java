package com.example.jeso.cetis1084av_app001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button btn1;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText) findViewById(R.id.editText);
        btn1 = (Button) findViewById(R.id.button);
        txt1 = (TextView) findViewById(R.id.txtView);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View View) {
                    String escrito = et1.getText().toString();
                    txt1.setText("" + escrito);
                }
            });

        }


    }


