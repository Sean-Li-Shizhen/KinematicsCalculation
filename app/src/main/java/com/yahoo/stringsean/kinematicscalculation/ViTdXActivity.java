package com.yahoo.stringsean.kinematicscalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ViTdXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vi_td_x);

        Button CalculateBtn = (Button)findViewById(R.id.CalculateBtn);
        CalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ViEditText = (EditText)findViewById(R.id.ViEditText);
                EditText TEditText = (EditText)findViewById(R.id.TEditText);
                EditText dXEditText = (EditText)findViewById(R.id.AEditText);
                TextView VfTextView = (TextView)findViewById(R.id.VfTextView);
                TextView ATextView = (TextView)findViewById(R.id.ATextView);

                double Vi = Double.parseDouble(ViEditText.getText().toString());
                double T = Double.parseDouble(TEditText.getText().toString());
                double dX = Double.parseDouble(dXEditText.getText().toString());
                double A = 2*(dX-Vi*T)/(T*T);
                double Vf = Vi+A*T;
                VfTextView.setText("Vf: " + Vf);
                ATextView.setText("A: " + A);
            }
        });
    }
}
