package com.yahoo.stringsean.kinematicscalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ViVfAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vi_vf_a);

        Button CalculateBtn = (Button)findViewById(R.id.CalculateBtn);
        CalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ViEditText = (EditText)findViewById(R.id.ViEditText);
                EditText VfEditText = (EditText)findViewById(R.id.VfEditText);
                EditText AEditText = (EditText)findViewById(R.id.AEditText);
                TextView TTextView = (TextView)findViewById(R.id.TTextView);
                TextView dXTextView = (TextView)findViewById(R.id.dXTextView);

                double Vi = Double.parseDouble(ViEditText.getText().toString());
                double Vf = Double.parseDouble(VfEditText.getText().toString());
                double A = Double.parseDouble(AEditText.getText().toString());
                double T = (Vf-Vi)/A;
                double dX = Vi*T + 0.5*A*T*T;
                TTextView.setText("T: " + T);
                dXTextView.setText("dX: " + dX);
            }
        });
    }
}
