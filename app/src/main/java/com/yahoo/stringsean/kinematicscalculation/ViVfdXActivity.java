package com.yahoo.stringsean.kinematicscalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ViVfdXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vi_vfd_x);

        Button CalculateBtn = (Button)findViewById(R.id.CalculateBtn);
        CalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ViEditText = (EditText)findViewById(R.id.ViEditText);
                EditText VfEditText = (EditText)findViewById(R.id.VfEditText);
                EditText dXEditText = (EditText)findViewById(R.id.AEditText);
                TextView TTextView = (TextView)findViewById(R.id.TTextView);
                TextView ATextView = (TextView)findViewById(R.id.ATextView);

                double Vi = Double.parseDouble(ViEditText.getText().toString());
                double Vf = Double.parseDouble(VfEditText.getText().toString());
                double dX = Double.parseDouble(dXEditText.getText().toString());
                double A = (Vf*Vf-Vi*Vi)/(2*dX);
                double T = (Vf-Vi)/A;
                TTextView.setText("T: " + T);
                ATextView.setText("A: " + A);
            }
        });
    }
}
