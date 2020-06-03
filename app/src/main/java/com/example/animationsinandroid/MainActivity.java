package com.example.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private TextView txtAndroid;
    private Button btnAnimate;

    private boolean isHelloWorldShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);
        txtAndroid = findViewById(R.id.txtAndroid);
        btnAnimate = findViewById(R.id.btnAnimate);


        txtHelloWorld.setX(2000);
        txtHiWorld.setX(-2000);
        txtAndroid.setY(-3000);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Log.i("MYTAG", "Hello World");

                //txtHelloWorld.animate().rotation(10f).setDuration(1000);

//                if (txtHiWorld.getAlpha() == 0) {
//                    txtHelloWorld.animate().alpha(0).setDuration(5000);
//                    txtHiWorld.animate().alpha(1).setDuration(5000);
//                }
//                else {
//
//                    txtHelloWorld.animate().alpha(1).setDuration(5000);
//                    txtHiWorld.animate().alpha(0).setDuration(5000);
//                }

                if (isHelloWorldShowing) {
                    txtHelloWorld.animate().alpha(0).setDuration(5000);
                    txtHiWorld.animate().alpha(1).setDuration(5000);
                    isHelloWorldShowing = false;
                }
                else if(!isHelloWorldShowing) {
                    txtHelloWorld.animate().alpha(1).setDuration(5000);
                    txtHiWorld.animate().alpha(0).setDuration(5000);
                    isHelloWorldShowing = true;
                }

            }
        });

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtAndroid.animate().translationX(3000).setDuration(2000);
            }
        });

        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtHelloWorld.animate().translationXBy(-2000f).setDuration(3000);
                txtHiWorld.animate().translationXBy(2000f).setDuration(5000);
                txtAndroid.animate().translationYBy(3000f).setDuration(5000);
            }
        });


    }
}
