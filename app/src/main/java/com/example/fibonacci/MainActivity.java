package com.example.fibonacci;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
int i = 0;
int seq;
int n =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button resetButton = findViewById(R.id.button2);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n = 1;
                TextView tv = findViewById(R.id.textView);
                tv.setText("Reset: "+ n);
            }
        });
    }

    public void startClick(View view) {
        Button button = findViewById(R.id.button);
        n+=n;

        TextView tv = findViewById(R.id.textView);
        tv.setText("Sequence: "+ n);


    }


//@RequiresApi(api= Build.VERSION_CODES.M)
//    public void onClick(View view){
//        Button button2  = findViewById(R.id.button2);
//
//        button2.setOnClickListener(new View.OnContextClickListener(){
//            @Override
//            public boolean onContextClick(View v) {
//                return false;
//            }
//
//            });
//
//}


//    static int fibonacci(int n)
//    {
//        int f[] = new int[n + 2];
//
//        int i;
//        f[0] = 0;
//        f[1] = 1;
//
//        for (i = 2; i <= n; i++) {
//            f[i] = f[i - 1] + f[i - 2];
//            System.out.print(f[i]);
//        }
//        return 0;
//    }
}