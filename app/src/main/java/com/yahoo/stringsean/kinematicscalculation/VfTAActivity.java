package com.yahoo.stringsean.kinematicscalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VfTAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vf_ta);

        Button CalculateBtn = (Button)findViewById(R.id.CalculateBtn);
        CalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText VfEditText = (EditText)findViewById(R.id.VfEditText);
                EditText TEditText = (EditText)findViewById(R.id.TEditText);
                EditText AEditText = (EditText)findViewById(R.id.AEditText);
                TextView ViTextView = (TextView)findViewById(R.id.ViTextView);
                TextView dXTextView = (TextView)findViewById(R.id.dXTextView);

                double Vf = Double.parseDouble(VfEditText.getText().toString());
                double T = Double.parseDouble(TEditText.getText().toString());
                double A = Double.parseDouble(AEditText.getText().toString());
                double Vi = Vf-A*T;
                double dX = Vi*T + 0.5*A*T*T;
                ViTextView.setText("Vi: " + Vi);
                dXTextView.setText("dX: " + dX);
            }
        });
    }
}
