package com.yahoo.stringsean.kinematicscalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ViTAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vi_ta);

        Button CalculateBtn = (Button)findViewById(R.id.CalculateBtn);
        CalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ViEditText = (EditText)findViewById(R.id.ViEditText);
                EditText TEditText = (EditText)findViewById(R.id.TEditText);
                EditText AEditText = (EditText)findViewById(R.id.AEditText);
                TextView VfTextView = (TextView)findViewById(R.id.VfTextView);
                TextView dXTextView = (TextView)findViewById(R.id.dXTextView);

                double Vi = Double.parseDouble(ViEditText.getText().toString());
                double T = Double.parseDouble(TEditText.getText().toString());
                double A = Double.parseDouble(AEditText.getText().toString());
                double Vf = Vi+A*T;
                double dX = Vi*T + 0.5*A*T*T;
                VfTextView.setText("Vf: " + Vf);
                dXTextView.setText("dX: " + dX);
            }
        });
    }
}
