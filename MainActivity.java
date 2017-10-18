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

        for(i=9;i>0;i--)
        {
            for(j=9;j>0;j--)
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
                b=a+b;
            }
            //每一種換行
            b="\n"+b;
        }
        ttv.setText(b);
    }
}
