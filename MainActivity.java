package com.example.shinyo.a9x9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ttv;
    String a,b;
    int i,j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ttv=(TextView)findViewById(R.id.tv);
        b="";
        for(i=1;i<10;i++)
        {
            for(j=1;j<10;j++)
            {
                //補空格
                if((i*j)<10)
                {
                    a=i+"*"+j+"=  "+i*j+"  ";
                }
                else{
                    a=i+"*"+j+"="+i*j+"  ";
                }
                //每3個換行
                if(j%3==0)
                {
                    a=a+"\n";
                }

                b=b+a;
            }
            //每一種換行
            b=b+"\n";
        }
        ttv.setText(b);
    }
}
