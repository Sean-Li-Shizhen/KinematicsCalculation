package com.yahoo.stringsean.kinematicscalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ViVfTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vi_vf_t);

        Button CalculateBtn = (Button)findViewById(R.id.CalculateBtn);
        CalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ViEditText = (EditText)findViewById(R.id.ViEditText);
                EditText VfEditText = (EditText)findViewById(R.id.VfEditText);
                EditText TEditText = (EditText)findViewById(R.id.TEditText);
                TextView ATextView = (TextView)findViewById(R.id.ATextView);
                TextView dXTextView = (TextView)findViewById(R.id.dXTextView);

                double Vi = Double.parseDouble(ViEditText.getText().toString());
                double Vf = Double.parseDouble(VfEditText.getText().toString());
                double T = Double.parseDouble(TEditText.getText().toString());
                double A = (Vf-Vi)/T;
                double dX = Vi*T + 0.5*A*T*T;
                ATextView.setText("A: " + A);
                dXTextView.setText("dX: " + dX);
            }
        });
    }
}
