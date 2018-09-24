package com.yahoo.stringsean.kinematicscalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ViAdXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vi_ad_x);

        Button CalculateBtn = (Button)findViewById(R.id.CalculateBtn);
        CalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ViEditText = (EditText)findViewById(R.id.ViEditText);
                EditText AEditText = (EditText)findViewById(R.id.AEditText);
                EditText dXEditText = (EditText)findViewById(R.id.AEditText);
                TextView VfTextView = (TextView)findViewById(R.id.VfTextView);
                TextView TTextView = (TextView)findViewById(R.id.TTextView);

                double Vi = Double.parseDouble(ViEditText.getText().toString());
                double A = Double.parseDouble(AEditText.getText().toString());
                double dX = Double.parseDouble(dXEditText.getText().toString());
                double Vf1 = Math.sqrt(2*A*dX+Vi*Vi);
                double Vf2 = -Math.sqrt(2*A*dX+Vi*Vi);
                double T1 = (Vf1-Vi)/A;
                double T2 = (Vf2-Vi)/A;
                if (T1>0) {
                    VfTextView.setText("Vf: " + Vf1);
                    TTextView.setText("T: " + T1);
                }
                else {
                    VfTextView.setText("Vf: " + Vf2);
                    TTextView.setText("T: " + T2);
                }
            }
        });
    }
}
