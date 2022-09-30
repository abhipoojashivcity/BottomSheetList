package com.example.bottomsheetlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity {
Button button;
BottomSheetDialog sheetDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.open);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                sheetDialog=new BottomSheetDialog(MainActivity.this,R.style.BottomSheetStyle);
                View view= LayoutInflater.from(MainActivity.this).inflate(R.layout.bottomsheet,(LinearLayout)findViewById(R.id.sheet));
                sheetDialog.setContentView(view);
                BottomSheetBehavior mBehavior = BottomSheetBehavior.from((View) view.getParent());
                mBehavior.setPeekHeight((int) 1000d);
                sheetDialog.show();

            }
        });
    }
}